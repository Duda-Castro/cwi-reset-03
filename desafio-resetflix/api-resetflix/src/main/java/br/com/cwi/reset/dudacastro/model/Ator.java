package br.com.cwi.reset.dudacastro.model;

import br.com.cwi.reset.dudacastro.Pessoa;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private Integer id;
    private Integer contador = 1;
    private StatusCarreira statusCarreira;

    public Ator(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        super (nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
        this.id = contador;
        contador = contador + 1;


    }

    public Integer getId() {
        return id;
    }

    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }


}


