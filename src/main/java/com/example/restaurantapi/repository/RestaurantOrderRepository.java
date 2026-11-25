package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantOrderRepository extends JpaRepository<RestaurantOrder, Integer> {
}
