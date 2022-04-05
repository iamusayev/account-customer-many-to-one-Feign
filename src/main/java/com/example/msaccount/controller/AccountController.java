package com.example.msaccount.controller;

import com.example.msaccount.model.dto.AccountResponseDto;
import com.example.msaccount.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/accounts")
public class AccountController {

    private final AccountService accountService;


    @GetMapping("/{id}")
    public List<AccountResponseDto> getAllAccountsByCustomerId(@PathVariable Long id) {
        return accountService.getAllAccountsByCustomerId(id);
    }


}
