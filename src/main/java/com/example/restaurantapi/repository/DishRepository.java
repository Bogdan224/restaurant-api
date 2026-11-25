package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
