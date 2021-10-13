package br.com.cwi.reset.dudacastro;

import java.time.LocalDate;

public class Ator extends Pessoa{

    protected Integer id;
    private Integer contador = 1;
    private StatusCarreira statusCarreira;

    public Ator(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        super (nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
        this.id = contador;
        contador = contador + 1;


    }


    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }


}


