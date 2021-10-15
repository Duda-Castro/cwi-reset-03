package br.com.cwi.reset.dudacastro.model;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private Integer contador = 0;
    private Integer id;


    public Diretor(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.id = contador;
        contador = contador + 1;

    }



}
