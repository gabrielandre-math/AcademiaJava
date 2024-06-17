package com.projetofinaljava.model;

public class Alimento extends ProdutoBase {
    private String dataValidade;

    //Construtores
    public Alimento() {}
    public Alimento(String nome, double preco, String dataValidade, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    //Métodos Getters
    @Override
    public String getTipo() {
        return "Alimento";
    }
    public String getDataValidade() {
        return dataValidade;
    }

    //Métodos Setters
    public void setDataValidade(String dataValidade) {
        this.dataValidade = validarDataCadastro(dataValidade);
    }

    //Métodos adicionais
    @Override
    public String exibirDetalhes() {
        return "Nome: " + this.getNome() +
                "\nPreco: " + this.getPreco() +
                "\nQuantidade: " + this.getQuantidade() +
                "\nData de validade: " + this.getDataValidade() +
                "\nQuantidade: " + this.getQuantidade();
    }
}
