package br.com.starwarsapi.ListagemdeFilmes.films.repository;

import br.com.starwarsapi.ListagemdeFilmes.films.model.FilmList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<FilmList, Long> {

}
