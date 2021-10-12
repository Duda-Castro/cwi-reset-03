package br.com.cwi.reset.dudacastro;

public enum StatusCarreira {
    EM_ATIVIDADE("Em Atividade"),
    APOSENTADO("Aposentado");

    private String descricao;

    public String getDescricao(){return descricao;}


    StatusCarreira(String descricao) {
        this.descricao = descricao;
    }
}
