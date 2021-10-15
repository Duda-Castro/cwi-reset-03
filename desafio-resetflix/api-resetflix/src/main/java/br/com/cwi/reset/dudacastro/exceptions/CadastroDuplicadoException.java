package br.com.cwi.reset.dudacastro.exceptions;

public class CadastroDuplicadoException extends Exception {
    public CadastroDuplicadoException(String tipo, String parametro) {
        super(String.format("Já existe um %s cadastrado para o nome %s.", tipo, parametro));
    }
}