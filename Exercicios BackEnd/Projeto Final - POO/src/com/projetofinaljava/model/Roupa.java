package com.projetofinaljava.model;

public class Roupa extends ProdutoBase {
    private String tamanho;
    private String cor;

    //Construtores
    public Roupa() {

    }
    public Roupa(String nome, double preco, String tamanho, String cor, int quantidade) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //Métodos Getters
    @Override
    public String getTipo() {
        return "Roupa";
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getCor() {
        return cor;
    }

    //Métodos adicionais
    public void setTamanho(String tamanho) {
        this.tamanho = verificarCampoTexto(tamanho);
    }
    public void setCor(String cor) {
        this.cor = verificarCampoTexto(cor);
    }

    //Métodos adicionais
    @Override
    public String exibirDetalhes() {
        return "Nome: " + this.getNome() +
                "\nPreco: " + this.getPreco() +
                "\nTamanho: " + this.getTamanho() +
                "\nCor: " + this.getCor() +
                "\nQuantidade: " + this.getQuantidade();
    }
}
