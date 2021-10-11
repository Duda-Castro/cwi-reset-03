public class Diretor extends Pessoa {

    private int qtdFilmes;


    public Diretor(int qtdFilmes,String nome,int dataDeNascimento,Genero genero) {

        super(nome,dataDeNascimento,genero);
        this.qtdFilmes = qtdFilmes;

    }




}
