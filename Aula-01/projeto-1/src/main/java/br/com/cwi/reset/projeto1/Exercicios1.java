package br.com.cwi.reset.projeto1;

import java.util.Arrays;
import java.util.List;

public class Exercicios1 {

    public Integer somarLista(List<Integer> numeros) {
    int soma = 0;
        for(int i = 0; i < numeros.size(); i++){
            soma = soma + numeros.get(i);


        }




        return soma;
    }

    public int calcularMedia(List<Integer> numeros) {

        int media;
        int soma = 0;
        for(int i=0;i<numeros.size();i++){
            soma = soma + numeros.get(i);


        }
        media = soma/numeros.size();





        return media;
    }

    public Integer obterMaiorNumero(List<Integer> numeros) {
    int maior = 0;

        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i) > maior){

                maior = numeros.get(i);


            };


        }



        return maior;
    }

    public String obterPalavraInvertida(String palavra) {
        String palavraInvertida = "";
        int contador = 0;
        char aux;

        for(int i = 0; i<palavra.length();i++ ){
            contador = contador + 1;


            char letra = palavra.charAt(palavra.length() - contador);
            String letraStr = Character.toString(letra);



            palavraInvertida = palavraInvertida + letraStr;


        }



        return palavraInvertida;
    }

    public List<Integer> ordenarLista(List<Integer> numeros) {

        Integer aux;
        Integer[] valores = numeros.toArray(new Integer[numeros.size()]);

        for(int i = 0; i <numeros.size()-1;i++){
            for(int f = i+1; f <numeros.size();f++) {
                if (valores[f] < valores[i]) {
                    aux = valores[f];
                    valores[f] = valores[i];
                    valores[i] = aux;


                }
            }
        }


        return Arrays.asList(valores);
    }
}

