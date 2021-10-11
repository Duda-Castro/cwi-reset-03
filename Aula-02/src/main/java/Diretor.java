import java.time.LocalDate;

public class Diretor extends Pessoa{

private int qtdFilmes;


    public Diretor(int qtdFilmes, String nome, LocalDate dataNascimento, Genero genero) {

        super(nome,dataNascimento,genero);
        this.qtdFilmes = qtdFilmes;
}
    }








