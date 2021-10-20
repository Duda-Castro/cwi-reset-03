package br.com.cwi.reset.aula.dois.exercicios;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    private Integer quantidadeFilmes;

    public Diretor(String nome, LocalDate dataNascimento, Integer quantidadeFilmes, Genero genero) {
        super(nome, dataNascimento, genero);
        this.quantidadeFilmes = quantidadeFilmes;
    }

}
