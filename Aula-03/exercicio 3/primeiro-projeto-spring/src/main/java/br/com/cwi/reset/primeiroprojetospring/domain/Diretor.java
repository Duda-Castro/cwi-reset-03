package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;

public class Diretor extends Pessoa {
    private Integer quantidadeFilmes;

    public Diretor(String nome, LocalDate dataNascimento, Integer quantidadeFilmes, Genero genero) {
        super(nome, genero);
        this.quantidadeFilmes = quantidadeFilmes;
    }

    public Integer getQuantidadeFilmes() {
        return quantidadeFilmes;
    }

    public void setQuantidadeFilmes(Integer quantidadeFilmes) {
        this.quantidadeFilmes = quantidadeFilmes;
    }
}
