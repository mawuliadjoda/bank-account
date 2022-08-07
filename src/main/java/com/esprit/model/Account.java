package com.esprit.model;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Builder
@Getter
public class Account {
    private LocalDate date;
    private Double amount;
}
