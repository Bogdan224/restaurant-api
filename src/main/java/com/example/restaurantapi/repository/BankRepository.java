package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Integer> {
}
