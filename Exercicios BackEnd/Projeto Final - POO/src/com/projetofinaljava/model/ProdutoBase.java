package com.projetofinaljava.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public abstract class ProdutoBase implements Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor vazio
    public ProdutoBase() {
    }

    // Construtor com parâmetros
    public ProdutoBase(String nome, double preco, int quantidade) {
        this.nome = verificarCampoTexto(nome);
        this.preco = verificarCampoDouble(preco);
        this.quantidade = verificarCampoInt(quantidade);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setNome(String nome) {

        this.nome = verificarCampoTexto(nome);
    }

    public void setPreco(double preco) {
        this.preco = verificarCampoDouble(preco);
    }

    public void setQuantidade(int quantidade) {

        this.quantidade = verificarCampoInt(quantidade);
    }

    // Métodos abstratos
    public abstract String exibirDetalhes();

    public abstract String getTipo();

    public String verificarCampoTexto(String campo) {
        if (campo == null || campo.trim().isEmpty() || !campo.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O campo deve conter apenas letras de A-Z ou a-z, espaços e não pode ser vazio!");
        }
        return campo;
    }
    public int verificarCampoInt(int campo) {
        if (campo < 0) {
            throw new IllegalArgumentException("O campo não pode ser negativo!");
        }
        return campo;
    }
    public double verificarCampoDouble(double campo) {
        if (campo < 0) {
            throw new IllegalArgumentException("O campo não pode ser negativo!");
        }
        return campo;
    }
    public String validarDataCadastro(String data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException("A data não pode ser nula ou vazia!");
        }
        try {
            LocalDate dataInserida = LocalDate.parse(data, formatter);
            LocalDate dataAtual = LocalDate.now();

            if (dataInserida.isBefore(dataAtual)) {
                throw new IllegalArgumentException("Data de cadastro inválida. Não pode ser uma data passada.");
            }

            return dataInserida.format(formatter);
        } catch (DateTimeParseException e) {
            return "Formato de data inválido. Use o formato dd/MM/yyyy.";
        }
    }


}
