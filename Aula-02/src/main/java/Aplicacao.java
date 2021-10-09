import java.util.Scanner;
public class Aplicacao {

    Scanner teclado = new Scanner(System.in);

    Filme filme1 = new Filme(teclado.next(),teclado.next(),teclado.nextInt(),teclado.nextInt(),teclado.nextInt(),teclado.nextInt()
            teclado.next(),teclado.nextInt(),teclado.nextInt());

    filme1.reproduzir();


    Filme filme2 = new Filme(teclado.next(),teclado.next(),teclado.nextInt(),teclado.nextInt(),teclado.nextInt(),teclado.nextInt()
            teclado.next(),teclado.nextInt(),teclado.nextInt());



}
