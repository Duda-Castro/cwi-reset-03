package br.com.cwi.reset.aula.dois.exercicios;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private Integer numeroOscars;

    public Ator(String nome, LocalDate dataNascimento, Integer numeroOscars, Genero genero) {
        super(nome, dataNascimento, genero);
        this.numeroOscars = numeroOscars;
    }

}
