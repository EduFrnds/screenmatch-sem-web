package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// propriedades que não estamos representando
@JsonIgnoreProperties (ignoreUnknown = true)

public record DadosEpisodio(
        @JsonAlias("Title") String titulo,
        @JsonAlias("Episode") Integer numero,
        @JsonAlias("imdbRating") String avalicao,
        @JsonAlias("Released") String dataLancamento) {

}
