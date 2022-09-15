package br.com.starwarsapi.ListagemdeFilmes.films.service;


import br.com.starwarsapi.ListagemdeFilmes.films.client.FilmClient;
import br.com.starwarsapi.ListagemdeFilmes.films.model.FilmList;
import br.com.starwarsapi.ListagemdeFilmes.films.model.StarWarsApiResponse;
import br.com.starwarsapi.ListagemdeFilmes.films.model.dto.DescriptionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {

    @Autowired
    private FilmClient filmClient;


    public StarWarsApiResponse findAll(){
        try {
            return filmClient.findAll()
                    .orElse(StarWarsApiResponse.creatEmptyResult());
        }catch (Exception e){
            e.printStackTrace();
            return StarWarsApiResponse.creatEmptyResult();
        }

    }

    public StarWarsApiResponse findMovieByTitle(@PathVariable String title){
        try {
            return filmClient.findByMovieTitle(title)
                    .orElse(new StarWarsApiResponse());
        }catch (Exception e){
            e.printStackTrace();
            return StarWarsApiResponse.creatEmptyResult();
        }
    }

    public StarWarsApiResponse findMovieById(@PathVariable Long id){
        try {
            return filmClient.findMovieById(id)
                    .orElse(new StarWarsApiResponse());
        }catch (Exception e){
            e.printStackTrace();
            return StarWarsApiResponse.creatEmptyResult();
        }
    }


    public StarWarsApiResponse findByProducer(@PathVariable String producer){
        try {
            return filmClient.findByProducer(producer)
                    .orElse(new StarWarsApiResponse());
        }catch (Exception e){
            e.printStackTrace();
            return StarWarsApiResponse.creatEmptyResult();
        }
    }



}

