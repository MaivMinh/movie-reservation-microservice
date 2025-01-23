package com.microservice.authservice.services;

import com.microservice.authservice.mappers.AccountMapper;
import com.microservice.authservice.model.Account;
import com.microservice.authservice.DTOs.AccountDTO;
import com.microservice.authservice.model.Role;
import com.microservice.authservice.repository.AccountRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountService {
  private final AccountRepo accountRepo;
  private final AccountMapper accountMapper;


  public AccountDTO findAccountDTOByUsername(String username) {
    return accountMapper.toDTO(accountRepo.findByUsername(username));
  }

  public Account save(Account account) {
    return accountRepo.save(account);
  }

  public Account findAccountByUsername(String username) {
    return accountRepo.findByUsername(username);
  }

  public Role doIntrospect(String userId) {
    // Thực hiện tìm kiếm ROLE của user.
    Account account = accountRepo.findAccountById(Integer.parseInt(userId));
    if (account != null && account.getId() > 0) {
      return account.getRole();
    }
    return null;
  }

  public Account findAccountByEmail(String email) {
    return accountRepo.findByEmail(email);
  }
}
