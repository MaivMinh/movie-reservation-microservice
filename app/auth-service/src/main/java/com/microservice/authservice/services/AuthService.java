package com.microservice.authservice.services;

import com.microservice.auth_proto.*;
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
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClient;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {
  private final JwtUtilsService jwtUtilsService;
  @Value("${spring.application.security.jwt.access-token-key}")
  private String accessToken;
  @Value("${spring.application.security.jwt.refresh-token-key}")
  private String refreshToken;
  @Value("${spring.application.security.jwt.access-token-expiration:3600000}")
  private long expiration;
  @Value("${spring.application.security.jwt.refresh-token-expiration:86400000}")
  private long refreshTokenExpiration;

  @Value("${spring.application.server.host}")
  private String host;

  private final AccountService accountService;
  private final RoleService roleService;
  private final AuthenticationManager authenticationManager;
  private final PasswordEncoder passwordEncoder;
  private final RestClient restClient;
  private final RedisService redisService;


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
            .signWith(Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8)))
            .compact();


    String emailTemplate = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <style>
                    body { font-family: 'Arial', sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }
                    .container { max-width: 600px; margin: 0 auto; padding: 20px; background-color: #ffffff; }
                    .header { background-color: #0d253f; padding: 20px; text-align: center; }
                    .header h1 { color: #ffffff; margin: 0; }
                    .content { padding: 20px; color: #333333; }
                    .button { display: inline-block; background-color: #01b4e4; color: #ffffff; text-decoration: none; padding: 12px 24px; border-radius: 4px; margin: 20px 0; }
                    .footer { padding: 20px; text-align: center; font-size: 12px; color: #999999; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header">
                        <h1>Movie Reservation</h1>
                    </div>
                    <div class="content">
                        <h2>Verify Your Email</h2>
                        <p>Thank you for creating an account with our Movie Reservation service. Please verify your email address to continue.</p>
                        <div style="text-align: center;">
                            <a href="%s/api/auth/verify-email?token=%s" class="button">Verify Email</a>
                        </div>
                        <p>If you didn't create this account, please ignore this email.</p>
                    </div>
                    <div class="footer">
                        <p>&copy; 2024 Movie Reservation. All rights reserved.</p>
                        <p>This is an automated email, please do not reply.</p>
                    </div>
                </div>
            </body>
            </html>
            """.formatted(host, token);

    // Then use this template in your REST client call
    ResponseEntity<?> response = restClient.post()
            .uri("/v3/smtp/email")
            .body(Map.of("sender", Map.of("name", "Movie Reservation Application", "email", "maivanminh.se@gmail.com"), "to", List.of(Map.of("email", account.getEmail())), "subject", "Verify Email", "htmlContent", emailTemplate))
            .retrieve()
            .toBodilessEntity();

    if (response.getStatusCode().is2xxSuccessful()) {
      log.info("Send mail successfully");
    } else {
      log.error("Send mail failed");
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
              .setMessage("Unauthenticated user")
              .build();
    }

    Account account = accountService.findAccountByUsername(authenticated.getName());
    if (account.getActive() == null || !account.getActive()) {
      return LoginResponse.newBuilder()
              .setStatus(HttpStatus.UNAUTHORIZED.value())
              .setMessage("Account is not active")
              .build();
    }


    /// Thực hiện việc tạo acces token và gửi về cho client.
    SecretKey secretKey = Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8));
    SecretKey refreshKey = Keys.hmacShaKeyFor(refreshToken.getBytes(StandardCharsets.UTF_8));

    String token = Jwts.builder()
            .setIssuer("Auth-Service")
            .setSubject("Access Token")
            .addClaims(Map.of("account_id", account.getId()))
            .setExpiration(new Date(System.currentTimeMillis() + expiration)) ///  1 hour.
            .setIssuedAt(new Date())
            .signWith(secretKey)
            .compact();

    String refreshToken = Jwts.builder()
            .setIssuer("Auth-Service")
            .setSubject("Refresh Token")
            .addClaims(Map.of("account_id", account.getId()))
            .setExpiration(new Date(System.currentTimeMillis() + refreshTokenExpiration)) ///  24 hours.
            .setIssuedAt(new Date())
            .signWith(refreshKey)
            .compact();

    /// Lưu access token vào redis.
    redisService.set(token, account.getId().toString(), expiration / 1000);

    return LoginResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setLoginSuccessInfo(LoginSuccessInfo.newBuilder()
                    .setAccessToken(
                            AccessToken.newBuilder()
                                    .setToken(token)
                                    .setExpiresIn(expiration)
                                    .setTokenType("Bearer")
                                    .build()
                    )
                    .setRefreshToken(
                            RefreshToken.newBuilder()
                                    .setToken(refreshToken)
                                    .setExpiresIn(refreshTokenExpiration)
                                    .build()
                    )
                    .build())
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
            .signWith(Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8)))
            .compact();

    /// Thực hiện gửi email về cho người dùng.

    String resetPasswordTemplate = """
            <!DOCTYPE html>
            <html>
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <style>
                    body { font-family: 'Arial', sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }
                    .container { max-width: 600px; margin: 0 auto; padding: 20px; background-color: #ffffff; }
                    .header { background-color: #0d253f; padding: 20px; text-align: center; }
                    .header h1 { color: #ffffff; margin: 0; }
                    .content { padding: 20px; color: #333333; }
                    .button { display: inline-block; background-color: #01b4e4; color: #ffffff; text-decoration: none; padding: 12px 24px; border-radius: 4px; margin: 20px 0; }
                    .footer { padding: 20px; text-align: center; font-size: 12px; color: #999999; }
                </style>
            </head>
            <body>
                <div class="container">
                    <div class="header">
                        <h1>Movie Reservation</h1>
                    </div>
                    <div class="content">
                        <h2>Reset Your Password</h2>
                        <p>We received a request to reset your password. Click the button below to create a new password.</p>
                        <div style="text-align: center;">
                            <a href="%s/account/reset-password?token=%s" class="button">Reset Password</a>
                        </div>
                        <p>If you didn't request this, please ignore this email.</p>
                    </div>
                    <div class="footer">
                        <p>&copy; 2024 Movie Reservation. All rights reserved.</p>
                        <p>This is an automated email, please do not reply.</p>
                    </div>
                </div>
            </body>
            </html>
            """.formatted(host, token);

    // Then use this template in your REST client call
    ResponseEntity<?> response = restClient.post()
            .uri("/v3/smtp/email")
            .body(Map.of("sender", Map.of("name", "Movie Reservation Application", "email", "maivanminh.se@gmail.com"), "to", List.of(Map.of("email", account.getEmail())), "subject", "Reset Password", "htmlContent", resetPasswordTemplate))
            .retrieve()
            .toBodilessEntity();

    if (response.getStatusCode().is2xxSuccessful()) {
      log.info("Send mail successfully");
    } else {
      log.error("Send mail failed");
      return ForgotPasswordResponse.newBuilder().setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value()).setMessage("Can not send email").build();
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
              .setSigningKey(Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8)))
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
              .setSigningKey(Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8)))
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

  public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
    /// Hàm thực hiện làm mới access token dựa vào refresh token.
    String token = request.getToken();
    if (!StringUtils.hasText(token)) {
      return RefreshTokenResponse.newBuilder()
              .setStatus(499)
              .setMessage("Refresh token is empty")
              .build();
    }

    Claims claims;
    try {
      claims = Jwts.parserBuilder()
              .setSigningKey(Keys.hmacShaKeyFor(refreshToken.getBytes(StandardCharsets.UTF_8)))
              .build()
              .parseClaimsJws(token)
              .getBody();
    } catch (RuntimeException e) {
      return RefreshTokenResponse.newBuilder()
              .setStatus(499)
              .setMessage("Refresh token is invalid or expired")
              .build();
    }

    String accountId = claims.get("account_id").toString();
    Account account = accountService.findAccountById(Integer.parseInt(accountId));
    if (account == null || account.getId() <= 0) {
      return RefreshTokenResponse.newBuilder()
              .setStatus(499)
              .setMessage("Account is invalid")
              .build();
    }

    String newAccessToken = Jwts.builder()
            .setIssuer("Auth-Service")
            .setSubject("Access Token")
            .addClaims(Map.of("account_id", account.getId()))
            .setExpiration(new Date(System.currentTimeMillis() + expiration)) ///  1 hour.
            .setIssuedAt(new Date())
            .signWith(Keys.hmacShaKeyFor(accessToken.getBytes(StandardCharsets.UTF_8)))
            .compact();

    /// Lưu access token vào redis.
    redisService.set(newAccessToken, account.getId().toString(), expiration / 1000);

    /// Trả về cho client access token mới.
    return RefreshTokenResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Refresh token successfully!")
            .setAccessToken(AccessToken.newBuilder()
                    .setToken(newAccessToken)
                    .setTokenType("Bearer")
                    .setExpiresIn(expiration)
                    .build())
            .build();
  }
}
