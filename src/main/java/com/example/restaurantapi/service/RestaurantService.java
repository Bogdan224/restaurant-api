package com.example.restaurantapi.service;

import com.example.restaurantapi.dto.restaurant.RestaurantRequest;
import com.example.restaurantapi.dto.restaurant.RestaurantResponse;
import com.example.restaurantapi.entity.Bank;
import com.example.restaurantapi.entity.City;
import com.example.restaurantapi.entity.Restaurant;
import com.example.restaurantapi.entity.Street;
import com.example.restaurantapi.repository.BankRepository;
import com.example.restaurantapi.repository.CityRepository;
import com.example.restaurantapi.repository.RestaurantRepository;
import com.example.restaurantapi.repository.StreetRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final BankRepository bankRepository;
    private final CityRepository cityRepository;
    private final StreetRepository streetRepository;

    public RestaurantService(RestaurantRepository restaurantRepository, BankRepository bankRepository, CityRepository cityRepository, StreetRepository streetRepository) {
        this.restaurantRepository = restaurantRepository;
        this.bankRepository = bankRepository;
        this.cityRepository = cityRepository;
        this.streetRepository = streetRepository;
    }

    public List<RestaurantResponse> getAll() {
        return restaurantRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public RestaurantResponse getById(Integer id) {
        return toResponse(findRestaurant(id));
    }

    @Transactional
    public RestaurantResponse create(RestaurantRequest request) {
        Restaurant restaurant = new Restaurant();

        updateFields(restaurant, request);

        var savedRestaurant = restaurantRepository.save(restaurant);

        return toResponse(savedRestaurant);
    }

    @Transactional
    public RestaurantResponse update(Integer id, RestaurantRequest request) {
        var restaurant = findRestaurant(id);

        updateFields(restaurant, request);

        var savedRestaurant = restaurantRepository.save(restaurant);

        return toResponse(savedRestaurant);
    }

    @Transactional
    public void delete(Integer id) {
        Restaurant restaurant = findRestaurant(id);

        restaurantRepository.delete(restaurant);
    }

    private Restaurant findRestaurant(Integer id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurant with id " + id + " not found"));
    }

    private void updateFields(Restaurant restaurant, RestaurantRequest request) {
        restaurant.setName(request.name());
        restaurant.setHouseNumber(request.houseNumber());
        restaurant.setPaymentAccount(request.paymentAccount());

        restaurant.setDirectorName(request.directorName());
        restaurant.setDirectorPatronymic(request.directorPatronymic());
        restaurant.setDirectorSurname(request.directorSurname());

        restaurant.setBank(findBank(request.bankId()));
        restaurant.setCity(findCity(request.cityId()));
        restaurant.setStreet(findStreet(request.streetId()));
    }

    private Bank findBank(Integer id) {
        return bankRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Bank with id " + id + " not found"));
    }

    private City findCity(Integer id) {
        return cityRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("City with id " + id + " not found"));
    }


    private Street findStreet(Integer id) {
        return streetRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Street with id " + id + " not found"));
    }

    private RestaurantResponse toResponse(Restaurant restaurant) {
        return new RestaurantResponse(
                restaurant.getId(),
                restaurant.getBank() != null
                        ? restaurant.getBank().getId() : null,
                restaurant.getCity() != null
                        ? restaurant.getCity().getId() : null,
                restaurant.getStreet() != null
                        ? restaurant.getStreet().getId() : null,
                restaurant.getName(),
                restaurant.getHouseNumber(),
                restaurant.getPaymentAccount(),
                restaurant.getDirectorName(),
                restaurant.getDirectorPatronymic(),
                restaurant.getDirectorSurname()
        );
    }
}
