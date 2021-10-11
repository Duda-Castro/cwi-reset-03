import java.util.Scanner;
public class Aplicacao {

    public static void main (String[] args) {
        Diretor diretor1= new Diretor (2,"Ari Aster",35,Genero.MASCULINO);
        Filme hereditario = new Filme("Hereditario", "Criança encapetada", 1, 30, 2018, 5.0, diretor1);

        hereditario.reproduzir();
        diretor1.ficha();




        Diretor diretor2= new Diretor (10,"Tarantino",58,Genero.MASCULINO);
        Filme jango = new Filme("Jango", "Tiroteio e racismo", 1, 30, 2012, 5.0, diretor2);

        jango.reproduzir();

    }
}
