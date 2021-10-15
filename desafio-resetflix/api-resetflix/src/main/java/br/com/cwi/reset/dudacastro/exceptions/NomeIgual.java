package br.com.cwi.reset.dudacastro.exceptions;

public class NomeIgual extends Exception{

    public NomeIgual (String campo, String name){


        super("Já existe um " + campo + " cadastrado para o nome" + name + " .");
    }


}