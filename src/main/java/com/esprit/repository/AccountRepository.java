package com.esprit.repository;

import com.esprit.model.Account;

import java.util.List;

public interface AccountRepository {
    void depositAmount(Account account, Double amount);
    void withDrawAmount(Account account, Double amount);
    List<Account> findAll();
}
