public class Filme {

    private String nome;
    private String descricao;
    private int duracaoHora;
    private int duracaoMinutos;
    private int ano;
    private int avaliacao;
    private String nomeDiretor;
    private int idadeDiretor;
    private int qtdFilmesDiretor;

    public Filme(String nome, String descricao, int duracaoHora, int duracaoMinutos, int ano,
                 int avaliacao, String nomeDiretor, int idadeDiretor, int qtdFilmesDiretor) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoHora = duracaoHora;
        this.duracaoMinutos = duracaoMinutos;
        this.ano = ano;
        this.avaliacao = avaliacao;
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.qtdFilmesDiretor = qtdFilmesDiretor;
    }

    public void reproduzir(){

        System.out.println("//////////////// Reproduzindo filme ////////////////");
        System.out.println("Nome do filme: " + nome);
        System.out.println("Sinopse: " + descricao);
        System.out.println("Duração do filme: " + duracaoHora + ":" + duracaoMinutos);
        System.out.println("Dirigido por: " + nomeDiretor);


    };






}
