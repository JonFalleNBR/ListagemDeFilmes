package br.com.starwarsapi.ListagemdeFilmes.films.repository;

import br.com.starwarsapi.ListagemdeFilmes.films.model.FilmList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmsRepository extends JpaRepository<FilmList, Long> {

}
