package br.com.cwi.reset.dudacastro.exceptions;

public class DeveSerInformadoPeloMenosNomeESobrenome extends Exception{

    public DeveSerInformadoPeloMenosNomeESobrenome(String campo) {

        super("Deve ser informado pelo menos nome e sobrenome no campo " + campo);
    }

}
