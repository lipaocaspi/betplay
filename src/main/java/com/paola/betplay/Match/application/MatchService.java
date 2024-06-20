package com.paola.betplay.Match.application;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Match.domain.models.Match;
import com.paola.betplay.Match.infrastructure.MatchRepository;

public class MatchService {
    private final MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    
    public void createMatch(Match match) {
        matchRepository.save(match);
    }

    public void updateMatch(Match match) {
        matchRepository.update(match);
    }

    public Optional<Match> getMatchById(int id) {
        return matchRepository.findById(id);
    }

    public void deleteMatch(int id) {
        matchRepository.delete(id);
    }

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }
}