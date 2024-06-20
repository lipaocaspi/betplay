package com.paola.betplay.Staff.adapters.out;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Staff.domain.models.Staff;
import com.paola.betplay.Staff.infrastructure.StaffRepository;

public class StaffMySQLRepository implements StaffRepository {

    @Override
    public void save(Staff staff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(Staff staff) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Staff> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Staff> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}