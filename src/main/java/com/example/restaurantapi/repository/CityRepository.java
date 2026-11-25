package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
