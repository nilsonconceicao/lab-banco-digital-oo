package br.org.dio.conta;

public enum TipoConta {

    CORRETE("Corrente"),
    POUPANCA("Poupança");

    private final String descricao;

    TipoConta(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
