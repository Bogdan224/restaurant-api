package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RevenueRepository extends JpaRepository<Revenue, Integer> {
}
