package com.paola.betplay.Country.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Country.domain.models.Country;
import com.paola.betplay.Country.infrastructure.CountryRepository;

public class CountryService {
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public void createCountry(Country country) {
        countryRepository.save(country);
    }

    public void updateCountry(Country country) {
        countryRepository.update(country);
    }

    public Optional<Country> getCountryById(int id) {
        return countryRepository.findById(id);
    }

    public void deleteCountry(int id) {
        countryRepository.delete(id);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}