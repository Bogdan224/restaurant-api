package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession, Integer> {
}
