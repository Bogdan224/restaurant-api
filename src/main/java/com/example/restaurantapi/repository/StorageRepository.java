package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage, Integer> {
}
