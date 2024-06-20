package com.paola.betplay.City.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.City.domain.models.City;
import com.paola.betplay.City.infrastructure.CityRepository;

public class CityService {
    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public void createCity(City city) {
        cityRepository.save(city);
    }

    public void updateCity(City city) {
        cityRepository.update(city);
    }

    public Optional<City> getCityById(int id) {
        return cityRepository.findById(id);
    }

    public void deleteCity(int id) {
        cityRepository.delete(id);
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}