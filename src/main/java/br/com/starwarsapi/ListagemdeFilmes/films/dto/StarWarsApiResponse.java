package br.com.starwarsapi.ListagemdeFilmes.films.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StarWarsApiResponse {

    private List<FilmResponse> results;
}
