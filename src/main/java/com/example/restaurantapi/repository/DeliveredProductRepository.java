package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.DeliveredProduct;
import com.example.restaurantapi.entity.DeliveredProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveredProductRepository extends JpaRepository<DeliveredProduct, DeliveredProductId> {
}
