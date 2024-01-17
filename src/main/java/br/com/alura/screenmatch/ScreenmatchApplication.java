package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Modularização do código.
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	//
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}


	// Esse Run é um método main em geral, ou seja , o executável.
	public void run(String... args) throws Exception {
		// Estanciamento da classe consumoApi
		var consumoApi = new ConsumoApi();
		// Consumo do api e busca do endereço
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
