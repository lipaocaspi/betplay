package com.paola.betplay.MatchTeam.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.MatchTeam.domain.models.MatchTeam;

public interface MatchTeamRepository {
    void save(MatchTeam matchTeam);
    void update(MatchTeam matchTeam);
    Optional<MatchTeam> findById(int id);
    void delete(int id);
    List<MatchTeam> findAll();
}
