package com.example.appPrueba.controller;

import com.example.appPrueba.domain.model.Movie;
import com.example.appPrueba.repository.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // esto te dice que todas las peticiones son http
@RequestMapping("/movies")  // este mapeado funciona con esto
public class MovieController {

    private final MovieRepository movieRepository;
    MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public List<Movie> talycual(){
        return movieRepository.findAll();
    }

    @PostMapping("/")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    /*
    // http://localhost:8080/hello/   -> el localhost:8080 es la ip_server
    @GetMapping("/")
    public String talycual() {
        return "Hello World";
    }

    // http://localhost:8080/hello/mars/
    @GetMapping("/mars")
    public String talycual2() {
        return "Hello Mars";
    }
    */
}
