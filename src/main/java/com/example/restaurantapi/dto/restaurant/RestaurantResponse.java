package com.example.restaurantapi.dto.restaurant;

public record RestaurantResponse(
        Integer id,
        Integer bankId,
        Integer cityId,
        Integer streetId,
        String name,
        String houseNumber,
        String paymentAccount,
        String directorName,
        String directorPatronymic,
        String directorSurname
) {
}
