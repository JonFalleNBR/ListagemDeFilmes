package br.com.starwarsapi.ListagemdeFilmes.films.client;

import br.com.starwarsapi.ListagemdeFilmes.films.dto.StarWarsApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@FeignClient(
        url = "${services.star-wars-api.url}",
        name = "filmClient",
        contextId = "filmClientId"
)
public interface FilmClient {

    @GetMapping
    Optional<StarWarsApiResponse> findAll();

    @GetMapping()
    Optional<StarWarsApiResponse> findByMovieTitle(@RequestParam(name = "search") String movieTitle);


}
