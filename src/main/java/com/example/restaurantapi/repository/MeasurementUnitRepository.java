package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.MeasurementUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementUnitRepository extends JpaRepository<MeasurementUnit, Integer> {
}
