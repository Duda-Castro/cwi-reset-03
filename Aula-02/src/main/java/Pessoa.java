import java.time.LocalDate;
import java.time.Period;

public class Pessoa {


    private String nome;
    private LocalDate dataNascimento;
    private LocalDate dataAtual = LocalDate.now();
    private Genero genero;

    public static int calcularIdade(LocalDate dataNascimento, LocalDate dataAtual) {
        if ((dataNascimento != null) && (dataAtual != null)) {
            return Period.between(dataNascimento, dataAtual).getYears();
        } else {
            return 0;
        }
    }


    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public void ficha(){
        System.out.println("//////////////// Ficha Cadastral do Diretor: ////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + calcularIdade(dataNascimento,dataAtual));
        System.out.println("Genero: " + genero.getDescricao());
    }



    public String getNome() {
        return nome;
    }
}


