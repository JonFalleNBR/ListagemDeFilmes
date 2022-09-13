package br.com.starwarsapi.ListagemdeFilmes.films.controller;


import br.com.starwarsapi.ListagemdeFilmes.films.client.FilmClient;
import br.com.starwarsapi.ListagemdeFilmes.films.dto.StarWarsApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class FilmController {

    @Autowired
    private FilmClient filmClient;

    @GetMapping
    public StarWarsApiResponse findAll(){
        return filmClient.findAll()
                .orElse(new StarWarsApiResponse());
    }

    @GetMapping("title/{title}")
    public StarWarsApiResponse findMovieByTitle(@PathVariable String title){
        return filmClient.findByMovieTitle(title)
                .orElse(new StarWarsApiResponse());
    }
}
