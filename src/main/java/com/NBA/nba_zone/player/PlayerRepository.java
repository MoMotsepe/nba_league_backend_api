package com.NBA.nba_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player,String> {
    void deleteByName(String playerName);
    Optional<Player> findByName(String name);
}
