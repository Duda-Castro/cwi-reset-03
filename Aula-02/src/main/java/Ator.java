import java.time.LocalDate;

public class Ator extends Pessoa {



    private int oscar;



    public Ator(int oscar, String nome, LocalDate dataNascimento, Genero genero) {

        super(nome,dataNascimento,genero);
        this.oscar = oscar;

    }

}
