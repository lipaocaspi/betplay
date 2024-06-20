package com.paola.betplay.Player.infrastructure;

import java.util.List;
import java.util.Optional;

import com.paola.betplay.Player.domain.models.Player;

public interface PlayerRepository {
    void save(Player player);
    void update(Player player);
    Optional<Player> findById(int id);
    void delete(int id);
    List<Player> findAll();
}