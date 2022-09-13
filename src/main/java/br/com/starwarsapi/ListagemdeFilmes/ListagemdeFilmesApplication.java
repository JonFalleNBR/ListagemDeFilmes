package br.com.starwarsapi.ListagemdeFilmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ListagemdeFilmesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListagemdeFilmesApplication.class, args);
	}

}