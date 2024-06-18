package com.paola.betplay.City.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.City.domain.models.City;

public interface CityRepository {
    void save(City city);
    void update(City city);
    Optional<City> findById(int id);
    void delete(int id);
    List<City> findAll();
}