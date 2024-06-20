package com.paola.betplay.Region.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Region.domain.models.Region;
import com.paola.betplay.Region.infrastructure.RegionRepository;

public class RegionService {
    private final RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
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
}