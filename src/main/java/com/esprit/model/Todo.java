package com.esprit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@Getter
@AllArgsConstructor


@Entity
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
}
