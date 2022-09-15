package br.com.starwarsapi.ListagemdeFilmes.films.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class FilmList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;

    @JsonProperty("episode_id")
    private Integer episodeId;

    private String director;

    private String producer;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("opening_crawl")
    private String openingCrawl;

    private Integer version;


}
