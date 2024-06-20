package com.paola.betplay.Role.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Role.domain.models.Role;

public interface RoleRepository {
    void save(Role role);
    void update(Role role);
    Optional<Role> findById(int id);
    void delete(int id);
    List<Role> findAll();
}
