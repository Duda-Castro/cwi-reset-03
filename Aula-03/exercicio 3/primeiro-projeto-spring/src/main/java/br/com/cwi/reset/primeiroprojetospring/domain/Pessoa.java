package br.com.cwi.reset.primeiroprojetospring.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pessoa {

    private String nome;

    private Genero genero;

    public Pessoa(String nome, Genero genero) {
        this.nome = nome;

        this.genero = genero;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);

        System.out.println("Genero: " + genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }



    public Genero getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
