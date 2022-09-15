package br.com.starwarsapi.ListagemdeFilmes.controller;

import br.com.starwarsapi.ListagemdeFilmes.films.controller.FilmController;
import br.com.starwarsapi.ListagemdeFilmes.films.model.StarWarsApiResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(FilmController.class)
public class FilmControllerTest {

    @Autowired(required = true)
    private MockMvc mockMvc;


    @Test
    public void testFilmController() throws Exception{
        this.mockMvc.perform(MockMvcRequestBuilders.get("movies"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray());

        }


}
