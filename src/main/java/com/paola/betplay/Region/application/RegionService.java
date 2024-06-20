package com.paola.betplay.Region.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Country.domain.models.Country;
import com.paola.betplay.Country.infrastructure.CountryRepository;
import com.paola.betplay.Region.domain.models.Region;
import com.paola.betplay.Region.infrastructure.RegionRepository;

public class RegionService {
    private final RegionRepository regionRepository;
    private final CountryRepository countryRepository;

    public RegionService(RegionRepository regionRepository, CountryRepository countryRepository) {
        this.regionRepository = regionRepository;
        this.countryRepository = countryRepository;
    }

    public void createRegion(Region region) {
        regionRepository.save(region);
    }

    public void updateRegion(Region region) {
        regionRepository.update(region);
    }

    public Optional<Region> getRegionById(int id) {
        return regionRepository.findById(id);
    }

    public void deleteRegion(int id) {
        regionRepository.delete(id);
    }

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    public int getCountryById(int id) {
        int idF = -1;
        Optional<Country> foundCountry = countryRepository.findById(id);
        if (foundCountry.isPresent()) {
            Country country = foundCountry.get();
            idF = country.getIdCountry();
        }
        return idF;
    }
}