package com.example.restaurantapi.dto.restaurant;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RestaurantRequest(
        Integer bankId,
        Integer cityId,
        Integer streetId,

        @NotBlank
        @Size(max = 50)
        String name,

        @Size(max = 10)
        String houseNumber,

        @Size(max = 20)
        String paymentAccount,

        @Size(max = 20)
        String directorName,

        @Size(max = 20)
        String directorPatronymic,

        @Size(max = 20)
        String directorSurname
) {
}
