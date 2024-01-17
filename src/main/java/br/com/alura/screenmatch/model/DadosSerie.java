package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


//@JsonAlias - mapea um apelido do campo no corpo do Json.
//Mapeamento Json  -> classe.

//JsonIgnoreProperties - ignora os campos que não existem na classe.
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias ("Title") String titulo,
                         @JsonAlias ("TotalSeasons") Integer totalTemporadas,
                         @JsonAlias ("ImbdRating") String avalicacao) {

}
