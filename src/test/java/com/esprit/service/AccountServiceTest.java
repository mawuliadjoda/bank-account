package com.esprit.service;

import com.esprit.repository.AccountRepository;
import com.esprit.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private AccountRepository accountRepository;


    @Test
    void should_get_all_account() {

        // When
        accountService.findAll();
        // Then
        Mockito.verify(accountRepository, Mockito.times(1)).findAll();
    }
}