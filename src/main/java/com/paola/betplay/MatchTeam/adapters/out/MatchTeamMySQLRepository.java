package com.paola.betplay.MatchTeam.adapters.out;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.MatchTeam.domain.models.MatchTeam;
import com.paola.betplay.MatchTeam.infrastructure.MatchTeamRepository;

public class MatchTeamMySQLRepository implements MatchTeamRepository {

    @Override
    public void save(MatchTeam matchTeam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(MatchTeam matchTeam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<MatchTeam> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<MatchTeam> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
