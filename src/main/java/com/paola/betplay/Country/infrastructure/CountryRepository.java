package com.paola.betplay.Country.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Country.domain.models.Country;

public interface CountryRepository {
    void save(Country country);
    void update(Country country);
    Optional<Country> findById(int id);
    void delete(int id);
    List<Country> findAll();
}