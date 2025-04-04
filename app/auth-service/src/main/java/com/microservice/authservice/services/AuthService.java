package com.microservice.authservice.services;

import com.microservice.auth_proto.*;
import com.microservice.authservice.model.AccessToken;
import com.microservice.authservice.model.Account;
import com.microservice.authservice.model.Role;
import com.microservice.authservice.records.ROLE;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {

  private final AccessTokenService accessTokenService;
  private final JwtUtilsService jwtUtilsService;
  private final MailService mailService;
  @Value("${application.security.jwt.secret-key}")
  private String secret;
  @Value("${application.security.jwt.expiration}")
  private long expiration;

  @Value("${application.server.host}")
  private String host;

  private final AccountService accountService;
  private final RoleService roleService;
  private final AuthenticationManager authenticationManager;
  private final PasswordEncoder passwordEncoder;

  public RegisterResponse register(RegisterRequest request) {
    /// Hàm tạo một Account mới bên trong hệ thống.
    if (accountService.findAccountByUsername(request.getUsername()) != null) {
      return RegisterResponse.newBuilder().setStatus(HttpStatus.CONFLICT.value()).setMessage("Username is already existed").build();
    }

    if (accountService.findAccountByEmail(request.getEmail()) != null) {
      return RegisterResponse.newBuilder().setStatus(HttpStatus.CONFLICT.value()).setMessage("Email is already existed").build();
    }

    Account account = Account.builder()
            .username(request.getUsername())
            .email(request.getEmail())
            .password(passwordEncoder.encode(request.getPassword()))
            .role(roleService.findByRoleName(ROLE.USER))
            .build();

    /// Thực  hiện gửi mail xác thực tới cho người dùng.
    String token = Jwts.builder()
            .setIssuer("auth-service")
            .setSubject("Verify Email")
            .addClaims(Map.of("email", account.getEmail()))
            .setExpiration(new Date(System.currentTimeMillis() + 30 * 60 * 1000)) // 30 minutes
            .setIssuedAt(new Date())
            .signWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
            .compact();
    boolean success = mailService.sendMailToVerifyEmail(account.getEmail(), host + "/api/auth", token);
    if (!success) {
      return RegisterResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Can not send email").build();
    }


    Account saved = accountService.save(account);
    if (saved == null) {
      return RegisterResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Can not create account").build();
    }


    /// Nếu gửi mail thành công thì trả về thông báo cho người dùng.
    return RegisterResponse.newBuilder().setStatus(HttpStatus.OK.value()).setMessage("Account created successfully!").build();
  }

  public LoginResponse login(LoginRequest request) {
    /// Hàm thực hiện việc đăng nhập người dùng.
    Authentication authentication = UsernamePasswordAuthenticationToken.unauthenticated(request.getUsername(), request.getPassword());

    Authentication authenticated = authenticationManager.authenticate(authentication);
    if (authenticated == null || !authenticated.isAuthenticated()) {
      log.error("Unauthenticated user");
      return LoginResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Unauthorized")
              .build();
    }

    /// Thực hiện revoke access token cũ nếu có.
    Account account = accountService.findAccountByUsername(authenticated.getName());
    if (account.getActive() == null || !account.getActive()) {
      return LoginResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Account is not active")
              .build();
    }
    accessTokenService.revokeAll(account);

    /// Thực hiện việc tạo acces token và gửi về cho client.
    SecretKey secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));

    String token = Jwts.builder()
            .setIssuer("Auth-Service")
            .setSubject("Access Token")
            .addClaims(Map.of("account_id", account.getId()))
            .setExpiration(new Date(System.currentTimeMillis() + expiration))
            .setIssuedAt(new Date())
            .signWith(secretKey)
            .compact();

    AccessToken accessToken = AccessToken.builder()
            .token(token)
            .account(account)
            .tokenType("Bearer")
            .expiresIn(new Timestamp(System.currentTimeMillis() + expiration))
            .isRevoked(false)
            .build();

    try {
      accessTokenService.save(accessToken);
    } catch (RuntimeException e) {
      return LoginResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not create access token")
              .build();
    }

    return LoginResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setLoginSuccessInfo(LoginSuccessInfo.newBuilder()
                    .setAccessToken(token)
                    .setTokenType("Bearer")
                    .setExpiresIn(new Timestamp(System.currentTimeMillis() + expiration).getTime())
                    .build())
            .build();
  }

  public LogoutResponse logout(LogoutRequest request) {
    /// Hàm thực hiện việc đăng xuất người dùng.
    String accessToken = request.getAccessToken();
    if (!StringUtils.hasText(accessToken)) {
      return LogoutResponse.newBuilder()
              .setStatus(HttpStatus.BAD_REQUEST.value())
              .setMessage("Bad request")
              .build();
    }

    AccessToken saved = accessTokenService.findAccessTokenByToken(accessToken);
    if (saved == null) {
      return LogoutResponse.newBuilder()
              .setStatus(HttpStatus.BAD_REQUEST.value())
              .setMessage("Access token not found")
              .build();
    }
    try {
      accessTokenService.revoke(saved);
    } catch (RuntimeException e) {
      return LogoutResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not revoke access token")
              .build();
    }
    return LogoutResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Logout successfully")
            .build();
  }

  public ProfileResponse profile(ProfileRequest request) {
    /// Hàm thực hiện việc lấy thông tin profile của người dùng.
    int accountId = request.getAccountId();

    Account account = accountService.findAccountById(accountId);
    if (account == null) {
      return ProfileResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Account not found")
              .build();
    }

    return ProfileResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setProfile(Profile.newBuilder()
                    .setUsername(account.getUsername())
                    .setEmail(account.getEmail())
                    .setRoles(String.valueOf(account.getRole().getName()))
                    .build())
            .build();
  }

  public AuthenticateResponse doAuthenticate(AuthenticateRequest request) {
    String token = request.getToken();
    try {
      Claims claims = jwtUtilsService.verifyToken(token);
      long ttl = Long.parseLong(claims.get("exp").toString()) - new Date().getTime() / 1000;
      return AuthenticateResponse.newBuilder()
              .setIsValid(true)
              .setUserId(claims.get("account_id").toString())
              .setTtl(ttl)
              .build();
    } catch (RuntimeException e) {
      return AuthenticateResponse.newBuilder()
              .setIsValid(false)
              .setUserId("")
              .setTtl(0)
              .build();
    }
  }

  public IdentityResponse doIdentity(IdentityRequest request) {
    int userId = request.getUserId();
    Role role = accountService.doIntrospect(userId);
    if (role == null) {
      return IdentityResponse.newBuilder().setActive(false).setRoles("").build();
    }
    return IdentityResponse.newBuilder().setActive(true).setRoles(role.getName().toString()).build();
  }

  public IsAdminResponse isAdmin(IsAdminRequest request) {
    /// Hàm thực hiện kiểm tra xem account id có phải là ADMIN.
    int accountId = request.getAccountId();
    Account account = accountService.findAccountById(accountId);
    if (account == null || !account.getRole().getName().equals(ROLE.ADMIN)) {
      return IsAdminResponse.newBuilder().setIsAdmin(false).build();
    }
    return IsAdminResponse.newBuilder().setIsAdmin(true).build();
  }

  public ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request) {
    /// Hàm thực hiện lấy thông tin của email và host. Sau đó kiểm tra email có tồn tại hay không.
    /// Nếu email tồn tại, gửi link đặt lại mật khẩu về email.

    String email = request.getEmail();
    String host = request.getHost();

    if (!StringUtils.hasText(email) || !StringUtils.hasText(host)) {
      return ForgotPasswordResponse.newBuilder()
              .setStatus(HttpStatus.BAD_REQUEST.value())
              .setMessage("Email or host is empty")
              .build();
    }

    Account account = accountService.findAccountByEmail(email);
    if (account == null) {
      return ForgotPasswordResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Email not found")
              .build();
    }

    String token = Jwts.builder()
            .setIssuer("auth-service")
            .setSubject("Reset Password")
            .addClaims(Map.of("email", account.getEmail()))
            .setExpiration(new Date(System.currentTimeMillis() + 30 * 60 * 1000)) // 30 minutes
            .setIssuedAt(new Date())
            .signWith(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
            .compact();

    /// Thực hiện gửi email về cho người dùng.
    boolean success = mailService.sendMailToResetPassword(account.getEmail(), "Reset Password", host, token);
    if (!success) {
      return ForgotPasswordResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not send email")
              .build();
    }
    return ForgotPasswordResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Reset password link sent to email")
            .build();
  }

  public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
    /// Hàm thực hiện lấy token và password từ request.
    /// Nếu token hợp lệ thì thay đổi password dựa vào email ở trong token.

    String token = request.getToken();
    String password = request.getPassword();

    if (!StringUtils.hasText(token) || !StringUtils.hasText(password)) {
      return ResetPasswordResponse.newBuilder()
              .setStatus(HttpStatus.BAD_REQUEST.value())
              .setMessage("Token or password is empty")
              .build();
    }

    Claims claims;
    try {
      claims = Jwts.parserBuilder()
              .setSigningKey(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
              .build()
              .parseClaimsJws(token)
              .getBody();
    } catch (RuntimeException e) {
      return ResetPasswordResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Token is invalid")
              .build();
    }
    String email = claims.get("email").toString();
    Account account = accountService.findAccountByEmail(email);
    if (account == null) {
      return ResetPasswordResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Email is invalid")
              .build();
    }
    account.setPassword(passwordEncoder.encode(password));
    try {
      accountService.save(account);
    } catch (RuntimeException e) {
      return ResetPasswordResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not reset password. Try again!")
              .build();
    }
    return ResetPasswordResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Reset password successfully!")
            .build();
  }

  public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) {
    /// Hàm thực hiện xác thực email của người dùng vừa đăng ký tài khoản.
    String token = request.getToken();
    if (!StringUtils.hasText(token)) {
      return VerifyEmailResponse.newBuilder()
              .setStatus(HttpStatus.BAD_REQUEST.value())
              .setMessage("Token is empty")
              .build();
    }

    Claims claims;
    try {
      claims = Jwts.parserBuilder()
              .setSigningKey(Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)))
              .build()
              .parseClaimsJws(token)
              .getBody();
    } catch (RuntimeException e) {
      return VerifyEmailResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Token is invalid")
              .build();
    }

    String email = claims.get("email").toString();
    Account account = accountService.findAccountByEmail(email);
    if (account == null) {
      return VerifyEmailResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Email is invalid")
              .build();
    }

    try {
      account.setActive(true);
      accountService.save(account);
    } catch (RuntimeException e) {
      return VerifyEmailResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not verify email. Try again!")
              .build();
    }
    return VerifyEmailResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Verify email successfully!")
            .build();
  }
}
