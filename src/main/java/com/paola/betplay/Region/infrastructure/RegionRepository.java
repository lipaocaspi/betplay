package com.paola.betplay.Region.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Region.domain.models.Region;

public interface RegionRepository {
    void save(Region region);
    void update(Region region);
    Optional<Region> findById(int id);
    void delete(int id);
    List<Region> findAll();
}