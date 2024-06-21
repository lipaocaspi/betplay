package com.paola.betplay.City.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.City.domain.models.City;
import com.paola.betplay.City.infrastructure.CityRepository;
import com.paola.betplay.Region.domain.models.Region;
import com.paola.betplay.Region.infrastructure.RegionRepository;

public class CityService {
    private final CityRepository cityRepository;
    private final RegionRepository regionRepository;

    public CityService(CityRepository cityRepository, RegionRepository regionRepository) {
        this.cityRepository = cityRepository;
        this.regionRepository = regionRepository;
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

    public int getRegionById(int id) {
        int idF = -1;
        Optional<Region> foundRegion = regionRepository.findById(id);
        if (foundRegion.isPresent()) {
            Region region = foundRegion.get();
            idF = region.getIdRegion();
        }
        return idF;
    }
}