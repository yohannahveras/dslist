package com.project.dslist.controllers;

import com.project.dslist.dto.GameDTO;
import com.project.dslist.dto.GameListDTO;
import com.project.dslist.dto.GameMinDTO;
import com.project.dslist.services.GameListService;
import com.project.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.dslist.dto.GameMinDTO;
import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
