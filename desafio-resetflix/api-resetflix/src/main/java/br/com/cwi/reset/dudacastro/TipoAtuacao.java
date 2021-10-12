package br.com.cwi.reset.dudacastro;

public enum TipoAtuacao {


    PRINCIPAL("Principal"),
    COADJUVANTE("Coadjuvante");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }


    TipoAtuacao(String descricao) {
        this.descricao = descricao;

    }


}
