package br.com.cwi.reset.dudacastro;

public class NaoNascidos extends Exception{


    public NaoNascidos(String campo){



        super("Não é possivel cadastrar " + campo + " não nascidos.");

    }

}
