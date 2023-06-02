package com.example.msaccount.model.dto;

import com.example.msaccount.model.enums.Currency;
import com.example.msaccount.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDto {

    private Long customerId;
    private BigDecimal amount;
    private Currency currency;

}
