package com.paola.betplay.Tech.adapters.out;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Tech.domain.models.Tech;
import com.paola.betplay.Tech.infrastructure.TechRepository;

public class TechMySQLRepository implements TechRepository {

    @Override
    public void save(Tech tech) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(Tech tech) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Tech> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Tech> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}