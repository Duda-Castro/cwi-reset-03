import java.util.Date;
public class Pessoa {


    private String nome;
    private Date dataDeNascimento = new Date();
    private int dataEmMilis = System.currentTimeMillis(dataDeNascimento);
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.dataDeNascimento = idade;
        this.genero = genero;
    }

    public void ficha(){
        System.out.println("//////////////// Ficha Cadastral do Diretor: ////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + dataDeNascimento);
        System.out.println("Genero: " + genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


