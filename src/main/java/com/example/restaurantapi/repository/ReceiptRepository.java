package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Receipt;
import com.example.restaurantapi.entity.ReceiptId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, ReceiptId> {
}
