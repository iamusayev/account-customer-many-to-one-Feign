package com.example.msaccount.service;

import com.example.msaccount.dao.entity.AccountEntity;
import com.example.msaccount.dao.repository.AccountRepository;
import com.example.msaccount.mapper.AccountMapper;
import com.example.msaccount.model.dto.AccountResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;


    public List<AccountResponseDto> getAllAccountsByCustomerId(Long id) {
        log.info("ActionLog.findAllAccountsByCustomerId.start customerId: {}", id);
        List<AccountEntity> accountsByCustomerId = accountRepository.findAllByCustomerId(id);
        List<AccountResponseDto> dtoList = AccountMapper
                .INSTANCE
                .mapEntitiesToResponseDtos(accountsByCustomerId);
        log.info("ActionLog.findAllAccountsByCustomerId.success customerId: {}", id);
        return dtoList;
    }

}
