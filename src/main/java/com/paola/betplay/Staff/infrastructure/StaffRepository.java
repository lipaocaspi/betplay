package com.paola.betplay.Staff.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Staff.domain.models.Staff;

public interface StaffRepository {
    void save(Staff staff);
    void update(Staff staff);
    Optional<Staff> findById(int id);
    void delete(int id);
    List<Staff> findAll();
}
