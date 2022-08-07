package com.esprit.service;

import com.esprit.model.Account;
import com.esprit.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class WithdrawAmountToAccountServiceTest {

    @InjectMocks
    private WithdrawAmountToAccountService withdrawAmountToAccountService;

    @Mock
    private AccountRepository accountRepository;

    @Test
    void should_decrease_account_balance_when_withdraw_amount() {
        // Given
        Account account = Account.builder()
                .amount(0.0)
                .date(LocalDate.now())
                .build();
        Double amountToWithdraw = 10.0;


        // When
        withdrawAmountToAccountService.accept(account, amountToWithdraw);

        // Then
        Mockito.verify(accountRepository, Mockito.times(1)).withDrawAmount(account, amountToWithdraw);
    }
}