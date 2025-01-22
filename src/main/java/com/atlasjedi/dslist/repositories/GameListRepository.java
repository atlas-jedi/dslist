package com.atlasjedi.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atlasjedi.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
