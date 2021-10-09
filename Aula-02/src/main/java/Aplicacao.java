import java.util.Scanner;
public class Aplicacao {

    public static void main (String[] args) {
        Diretor diretor1= new Diretor ("Ari Aster",35,2);
        Filme hereditario = new Filme("Hereditario", "Criança encapetada", 1, 30, 2018, 5.0);

        hereditario.reproduzir();


        Diretor diretor2= new Diretor ("Tarantino",58,10);
        Filme jango = new Filme("Jango", "Tiroteio e racismo", 1, 30, 2012, 5.0);

        jango.reproduzir();

    }
}
