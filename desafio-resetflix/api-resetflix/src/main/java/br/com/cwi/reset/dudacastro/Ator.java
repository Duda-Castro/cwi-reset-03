package br.com.cwi.reset.dudacastro;

import java.time.LocalDate;

public class Ator extends Pessoa{


    private StatusCarreira statusCarreira;

    public Ator(Integer id, String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) {
        super (id, nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
    }

}
