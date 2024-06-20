package com.paola.betplay.Tech.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Tech.domain.models.Tech;

public interface TechRepository {
    void save(Tech tech);
    void update(Tech tech);
    Optional<Tech> findById(int id);
    void delete(int id);
    List<Tech> findAll();
}