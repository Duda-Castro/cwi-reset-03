package br.com.cwi.reset.dudacastro.exceptions;

public class CampoObrigatorioNaoInformadoException extends Exception {


public CampoObrigatorioNaoInformadoException(String campo){



    super("Campo obrigatório não informado. Favor informar o campo " + campo + ".");

}



}