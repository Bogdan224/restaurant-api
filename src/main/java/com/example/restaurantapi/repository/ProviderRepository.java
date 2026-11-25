package com.example.restaurantapi.repository;

import com.example.restaurantapi.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
