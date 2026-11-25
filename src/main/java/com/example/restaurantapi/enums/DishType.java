package com.example.restaurantapi.enums;

import jakarta.persistence.EnumeratedValue;

public enum DishType {
    APPETIZERS("Закуски"),
    FIRST_COURSES("Первые блюда"),
    MAIN_COURSES("Вторые блюда"),
    DESSERT("Десерт"),
    DRINKS("Напитки"),
    BAKERY("Выпечка"),
    PIZZA("Пицца"),
    SUSHI("Суши"),
    SALAD("Салат");

    @EnumeratedValue
    private final String value;

    DishType(String value) {
        this.value = value;
    }
}
