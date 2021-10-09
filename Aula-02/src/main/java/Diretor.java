public class Diretor extends Pessoa {

    private int qtdFilmes;


    public Diretor(int qtdFilmes,String nome,int idade,Genero genero) {

        super(nome,idade,genero);
        this.qtdFilmes = qtdFilmes;

    }



}
