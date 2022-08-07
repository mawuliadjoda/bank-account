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
class AccountBankApplicationTests {
    @InjectMocks
    private DepositAmountToAccountService depositAmountToAccountService;

    @Mock
    private AccountRepository accountRepository;

    @Test
    void should_increase_account_balance_when_deposit_amount() {
        // Given
        Account account = Account.builder()
                .amount(0.0)
                .date(LocalDate.now())
                .build();
        Double amountToDeposit = 20.0;
        // When
        depositAmountToAccountService.accept(account, amountToDeposit);


        // Then
        Mockito.verify(accountRepository, Mockito.times(1)).depositAmount(account, amountToDeposit);
    }

}
