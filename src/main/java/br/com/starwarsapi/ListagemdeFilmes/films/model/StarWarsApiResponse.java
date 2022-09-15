package br.com.starwarsapi.ListagemdeFilmes.films.model;

import br.com.starwarsapi.ListagemdeFilmes.films.model.dto.DescriptionDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StarWarsApiResponse {

    private List<FilmList> results;

    public static StarWarsApiResponse creatEmptyResult(){
        var response = new StarWarsApiResponse();
        response.setResults(Collections.emptyList());
        return response;
    }
}
