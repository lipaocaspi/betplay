package com.paola.betplay.Position.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Position.domain.models.Position;

public interface PositionRepository {
    void save(Position position);
    void update(Position position);
    Optional<Position> findById(int id);
    void delete(int id);
    List<Position> findAll();
}