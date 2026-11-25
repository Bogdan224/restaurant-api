package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
}
