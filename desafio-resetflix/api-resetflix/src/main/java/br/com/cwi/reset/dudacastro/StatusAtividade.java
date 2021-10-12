package br.com.cwi.reset.dudacastro;

public enum StatusAtividade {

    EM_ATIVIDADE("Em Atividade"),
    ENCERRADO("Encerrado");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }


    StatusAtividade(String descricao) {
        this.descricao = descricao;

    }
}
