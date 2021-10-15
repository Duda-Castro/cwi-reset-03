package br.com.cwi.reset.dudacastro.exceptions;

public class ListaVaziaException extends Exception {
    public ListaVaziaException(String tipo, String tipoPlural) {
        super(String.format("Nenhum %s cadastrado, favor cadastar %s.", tipo, tipoPlural));
    }
}