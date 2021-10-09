public class Diretor {

private String nome;
private int idade;
private int qtdFilmes;
private Genero genero;

    public Diretor(String nome, int idade, int qtdFilmes,Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.qtdFilmes = qtdFilmes;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }


    public void ficha(){
        System.out.println("//////////////// Ficha Cadastral do Diretor: ////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Genero: " + genero.getDescricao());
    }


}
