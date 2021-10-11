import java.time.LocalDate;
public class Aplicacao {

    public static void main (String[] args) throws AvaliacaoForaDoPadraoException {
        Diretor diretor1 = new Diretor (5,"Ari Aster",LocalDate.of(1996, 6, 14), Genero.MASCULINO);
        Filme hereditario = new Filme("Hereditario", "Criança encapetada", 1, 30, 2018, 3.5, diretor1);

        diretor1.ficha();
        hereditario.reproduzir();


        Ator ator = new Ator(5, "Teste", LocalDate.of(1996, 6, 14), Genero.FEMININO);
        ator.ficha();

    }
}
