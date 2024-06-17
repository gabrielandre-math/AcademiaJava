package com.projetofinaljava.service;

import com.projetofinaljava.model.Alimento;
import com.projetofinaljava.model.Eletronico;
import com.projetofinaljava.model.Produto;
import com.projetofinaljava.model.Roupa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CarrinhoDeCompras {
    private List<Produto> produtoList;
    private double totalValor;

    //Construtor
    public CarrinhoDeCompras() {
        this.produtoList = new ArrayList<>();
    }

    //Métodos Getters
    public double getTotalValor() {
        return totalValor;
    }

    //Métodos Setters
    public void setTotalValor(double totalValor) {
        if (totalValor < 0) {
            throw new IllegalArgumentException("O campo não pode ser negativo!");
        }
        this.totalValor = totalValor;
    }

    //Métodos
    public void adicionarItem(Produto produto) {
        this.produtoList.add(produto);
    }
    public void removerItem(Produto produto) {
        Scanner sc = new Scanner(System.in);
        String nome;
        boolean encontrou = false;
        System.out.println("Lista de itens: ");
        listarItem();
        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();
        for (Produto p : this.produtoList) {
            if (p.getNome().equals(produto.getNome())) {
                this.produtoList.remove(p);
                encontrou = true;
            }
        }
        if (encontrou) {
            System.out.println("O produto " + produto.getNome() + " foi removido!");
        } else {
            System.out.println("O produto " + produto.getNome() + " não existe no carrinho!");
        }
    }
    //Lista os itens de modo formatado, da mesma forma que é gravado no arquivo .txt
    public void listarItem() {
        if (this.produtoList.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Lista de itens no carrinho:");
            System.out.printf("| %-4s | %-10s | %-12s | %-8s | %-9s | %-8s |\n",
                    "Item", "Quantidade", "Nome", "Preço", "Subtotal", "Total");
            System.out.println("|------|------------|--------------|----------|-----------|----------|");

            int contador = 1;
            double totalCarrinho = 0.0;
            for (Produto produto : this.produtoList) {
                double subtotal = produto.getQuantidade() * produto.getPreco();
                totalCarrinho += subtotal;

                System.out.printf("| %-4d | %-10d | %-12s | %-8.2f | %-9.2f | %-8s |\n",
                        contador,
                        produto.getQuantidade(),
                        produto.getNome(),
                        produto.getPreco(),
                        subtotal,
                        (contador == produtoList.size()) ? String.format("%.2f", totalCarrinho) : "");

                contador++;
            }
        }
    }
    //Exporta os itens do carrinho
    public List<Produto> exportarListaProdutos() {
        return this.produtoList;
    }
    //Método para calcular o valor total
    public double calcularValorTotal() {
        double total = 0.0;
        for (Produto p : this.produtoList) {
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

    //Método de gravação
    public void gerarArquivoTexto(String nomeArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            //Escreve o cabeçalho
            writer.write("| Item | Quantidade | Nome       | Preço   | Subtotal |  Total   |\n");
            writer.write("|------|------------|------------|---------|----------|----------|\n");

            //Escreve os itens do carrinho
            int contador = 1;
            double totalCarrinho = 0.0;
            for (Produto produto : produtoList) {
                double subtotal = produto.getQuantidade() * produto.getPreco();
                totalCarrinho += subtotal;

                //Determina o tipo específico de produto para formatar corretamente os detalhes
                String nomeProduto = "";
                String detalhesProduto = "";

                if (produto instanceof Eletronico) {
                    Eletronico eletronico = (Eletronico) produto;
                    nomeProduto = eletronico.getNome();
                    detalhesProduto = String.format("%d meses de garantia", eletronico.getGarantiaMeses());
                } else if (produto instanceof Roupa) {
                    Roupa roupa = (Roupa) produto;
                    nomeProduto = roupa.getNome();
                    detalhesProduto = String.format("Tamanho %s, cor %s", roupa.getTamanho(), roupa.getCor());
                } else if (produto instanceof Alimento) {
                    Alimento alimento = (Alimento) produto;
                    nomeProduto = alimento.getNome();
                    detalhesProduto = String.format("Validade: %s", alimento.getDataValidade());
                } else {
                    nomeProduto = produto.getNome();
                }

                writer.write(String.format("| %-4d | %-10d | %-10s | %-7.2f | %-8.2f |%9s |\n",
                        contador,
                        produto.getQuantidade(),
                        nomeProduto,
                        produto.getPreco(),
                        subtotal,
                        (contador == produtoList.size()) ? String.format("%-8.2f", totalCarrinho) : ""));
                contador++;
            }
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }
}
