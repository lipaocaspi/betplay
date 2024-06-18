package com.paola.betplay.Match.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Match.domain.models.Match;

public interface MatchRepository {
    void save(Match match);
    void update(Match match);
    Optional<Match> findById(int id);
    void delete(int id);
    List<Match> findAll();
}
