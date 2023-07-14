package com.fulldeveloper.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fulldeveloper.dslist.dto.GameMinDTO;
import com.fulldeveloper.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController { //É ELE QUE DISPONIBILIZA A API AO FRONT-END
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findALL();
		return result;
	}
	
	
	
}
