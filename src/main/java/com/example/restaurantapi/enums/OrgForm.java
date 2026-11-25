package com.example.restaurantapi.enums;

import jakarta.persistence.EnumeratedValue;

public enum OrgForm {
    OOO("ООО"),
    OAO("ОАО"),
    PAO("ПАО"),
    AO("АО"),
    IP("ИП"),
    ZAO("ЗАО");

    @EnumeratedValue
    private final String value;

    OrgForm(String value) {
        this.value = value;
    }
}
