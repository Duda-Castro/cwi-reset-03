package br.com.cwi.reset.dudacastro;

import java.time.LocalDate;

public class Pessoa {



    private String nome;
    private LocalDate dataNascimento;
    private Integer anoInicioAtividade;

    public Pessoa(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) {

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }

    public void setAnoInicioAtividade(Integer anoInicioAtividade) {
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }
}
