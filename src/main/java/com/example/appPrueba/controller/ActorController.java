package com.example.appPrueba.controller;

import com.example.appPrueba.domain.model.Actor;
import com.example.appPrueba.domain.model.Movie;
import com.example.appPrueba.repository.ActorRepository;
import com.example.appPrueba.repository.MovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // esto te dice que todas las peticiones son http
@RequestMapping("/actor")  // este mapeado funciona con esto
public class ActorController {

    private final ActorRepository actorRepository;
    ActorController(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

    @GetMapping("/")
    public List<Actor> talycual(){
        return actorRepository.findAll();
    }
}
