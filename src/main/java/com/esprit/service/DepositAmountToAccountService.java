package com.esprit.service;

import com.esprit.model.Account;
import com.esprit.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;

@Service
@RequiredArgsConstructor
public class DepositAmountToAccountService implements BiConsumer<Account, Double> {
    private AccountRepository accountRepository;

    @Override
    public void accept(Account account, Double amount) {
        accountRepository.depositAmount(account, amount);
    }
}
