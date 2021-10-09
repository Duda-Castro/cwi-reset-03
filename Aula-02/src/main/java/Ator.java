public class Ator {


    private String nome;
    private int idade;
    private int oscar;

    private Genero genero;

    public Ator(String nome, int idade, int oscar, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.oscar = oscar;
        this.genero = genero;
    }

    public void ficha(){
        System.out.println("//////////////// Ficha Cadastral do Ator: ////////////////");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Genero: " + genero.getDescricao());
    }

}
