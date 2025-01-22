package com.atlasjedi.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atlasjedi.dslist.dto.GameDTO;
import com.atlasjedi.dslist.dto.GameMinDTO;
import com.atlasjedi.dslist.entities.Game;
import com.atlasjedi.dslist.projections.GameMinProjection;
import com.atlasjedi.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findUnique(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
}
