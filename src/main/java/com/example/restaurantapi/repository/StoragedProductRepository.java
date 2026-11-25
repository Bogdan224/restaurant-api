package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.StoragedProduct;
import com.example.restaurantapi.entity.StoragedProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoragedProductRepository extends JpaRepository<StoragedProduct, StoragedProductId> {
}
