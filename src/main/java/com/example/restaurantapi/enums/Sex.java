package com.example.restaurantapi.enums;

import jakarta.persistence.EnumeratedValue;

public enum Sex {
    M("М"),
    W("Ж");

    @EnumeratedValue
    private final String value;

    Sex(String value) {
        this.value = value;
    }
}
