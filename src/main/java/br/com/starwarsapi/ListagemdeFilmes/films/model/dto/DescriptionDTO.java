package br.com.starwarsapi.ListagemdeFilmes.films.model.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DescriptionDTO {

    private Long id;
    private String title;
    private String director;
    private String openingCrawl;
    private LocalDateTime releaseDate;
}
