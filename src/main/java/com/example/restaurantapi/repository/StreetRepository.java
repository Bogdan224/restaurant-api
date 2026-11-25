package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, Integer> {
}
