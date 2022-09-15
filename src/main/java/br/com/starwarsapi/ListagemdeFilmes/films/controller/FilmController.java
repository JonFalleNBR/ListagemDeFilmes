package br.com.starwarsapi.ListagemdeFilmes.films.controller;


import br.com.starwarsapi.ListagemdeFilmes.films.model.FilmList;
import br.com.starwarsapi.ListagemdeFilmes.films.model.StarWarsApiResponse;
import br.com.starwarsapi.ListagemdeFilmes.films.model.dto.DescriptionDTO;
import br.com.starwarsapi.ListagemdeFilmes.films.repository.FilmsRepository;
import br.com.starwarsapi.ListagemdeFilmes.films.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class FilmController {


    @Autowired
    FilmsRepository filmsRepository;

    @Autowired
    private FilmService filmService;



    @GetMapping
    public StarWarsApiResponse findAll() {
        return filmService.findAll();
    }


    @GetMapping("title/{title}")
    public StarWarsApiResponse findMovieByTitle(@PathVariable String title) {
        return filmService.findMovieByTitle(title);
    }

    @GetMapping("producer/{producer}")
    public StarWarsApiResponse findByProducer(@PathVariable String producer) {
        return filmService.findByProducer(producer);
    }

    @GetMapping("id/{episode_id}")
    public StarWarsApiResponse findMovieById(@PathVariable Long id) {
        return filmService.findMovieById(id);

    }
}
