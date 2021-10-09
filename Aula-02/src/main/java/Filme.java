public class Filme {

    private String nome;
    private String descricao;
    private int duracaoHora;
    private int duracaoMinutos;
    private int ano;
    private double avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricao, int duracaoHora, int duracaoMinutos, int ano,
                 double avaliacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoHora = duracaoHora;
        this.duracaoMinutos = duracaoMinutos;
        this.ano = ano;
        this.avaliacao = avaliacao;

    }

    public void reproduzir(){

        System.out.println("//////////////// Reproduzindo filme ////////////////");
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + descricao);
        System.out.println("Duração do filme: " + duracaoHora + ":" + duracaoMinutos);
        System.out.println("Dirigido por: " + diretor.getNome());


    }






}
