package com.microservice.authservice.mappers;

import com.microservice.authservice.model.Account;
import com.microservice.authservice.DTOs.AccountDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
  AccountDTO toDTO(Account account);
}
