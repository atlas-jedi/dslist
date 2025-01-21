package com.atlasjedi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atlasjedi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
