package br.com.starwarsapi.ListagemdeFilmes.films.model.dto;


import br.com.starwarsapi.ListagemdeFilmes.films.model.FilmList;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DescriptionDTO {

    private Integer id;
    private String title;
    private String director;
    private Integer version;

    public DescriptionDTO(FilmList response) {
        this.id = response.getEpisodeId();
        this.title = response.getTitle();
        this.director = response.getDirector();
        this.version = response.getVersion();
    }

    public static List<DescriptionDTO> converter(List<FilmList> films) {
        return films.stream().map(DescriptionDTO :: new)
                .collect(Collectors.toList());
    }
}
