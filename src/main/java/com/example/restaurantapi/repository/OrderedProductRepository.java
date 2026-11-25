package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.OrderedProduct;
import com.example.restaurantapi.entity.OrderedProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductRepository extends JpaRepository<OrderedProduct, OrderedProductId> {
}
