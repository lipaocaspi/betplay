package com.paola.betplay.Team.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Team.domain.models.Team;

public interface TeamRepository {
    void save(Team team);
    void update(Team team);
    Optional<Team> findById(int id);
    void delete(int id);
    List<Team> findAll();
}
