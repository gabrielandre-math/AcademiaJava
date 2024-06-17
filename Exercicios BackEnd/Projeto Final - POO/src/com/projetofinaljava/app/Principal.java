package com.projetofinaljava.app;

import com.projetofinaljava.model.Alimento;
import com.projetofinaljava.model.Eletronico;
import com.projetofinaljava.model.Roupa;
import com.projetofinaljava.service.CarrinhoDeCompras;
import com.projetofinaljava.model.Produto;

import java.io.IOException;
import java.util.List;

import static com.projetofinaljava.service.CarrinhoDeCompras.listarProdutosECalcularTotal;

public class Principal {
    public static void main(String[] args) {

        //Cria duas instâncias de CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        //Adiciona itens ao primeiro carrinho
        Eletronico smartphone = new Eletronico();
        smartphone.setNome("Smartphone");
        smartphone.setPreco(2999.90);
        smartphone.setGarantiaMeses(12);
        smartphone.setQuantidade(3);
        carrinho1.adicionarItem(smartphone);

        Roupa camiseta = new Roupa();
        camiseta.setNome("Camiseta");
        camiseta.setPreco(89.99);
        camiseta.setTamanho("M");
        camiseta.setCor("Azul");
        camiseta.setQuantidade(6);
        carrinho1.adicionarItem(camiseta);

        Alimento arroz = new Alimento();
        arroz.setNome("Arroz");
        arroz.setPreco(9.99);
        arroz.setDataValidade("10/06/2025");
        arroz.setQuantidade(4);
        carrinho1.adicionarItem(arroz);

        //Adiciona itens ao segundo carrinho
        Eletronico tablet = new Eletronico();
        tablet.setNome("Tablet");
        tablet.setPreco(1999.90);
        tablet.setGarantiaMeses(6);
        tablet.setQuantidade(1);
        carrinho2.adicionarItem(tablet);

        Roupa calcaJeans = new Roupa();
        calcaJeans.setNome("Calça Jeans");
        calcaJeans.setPreco(129.99);
        calcaJeans.setTamanho("G");
        calcaJeans.setCor("Preto");
        calcaJeans.setQuantidade(1);
        carrinho2.adicionarItem(calcaJeans);

        //Exporta a lista de produtos de cada carrinho
        List<Produto> produtosCarrinho1 = carrinho1.exportarListaProdutos();
        List<Produto> produtosCarrinho2 = carrinho2.exportarListaProdutos();

        //Exibindo no console
        System.out.println("\nProdutos do Carrinho 1:");
        for (Produto produto : produtosCarrinho1) {
            System.out.println("Tipo do produto: " + produto.getTipo());
            System.out.println(produto.exibirDetalhes());
            System.out.println("");
        }

        System.out.println("\nProdutos do Carrinho 2:");
        for (Produto produto : produtosCarrinho2) {
            System.out.println("Tipo do produto: " + produto.getTipo());
            System.out.println(produto.exibirDetalhes());
            System.out.println("");
        }

        //Lista os produtos e calcula o total de ambos os carrinhos
        listarProdutosECalcularTotal(carrinho1, "Carrinho 1");
        listarProdutosECalcularTotal(carrinho2, "Carrinho 2");


        //Grava os arquivos referentes a cada carrinho de compras
        try {
            carrinho1.gerarArquivoTexto("carrinho1.txt");
            carrinho2.gerarArquivoTexto("carrinho2.txt");
            System.out.println("Arquivos de carrinho gerados com sucesso.");
            System.out.println("Vá até o diretório: Projeto Final - POO/src/com/projetofinaljava para visualizar os arquivos .txt");
        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo de carrinho: " + e.getMessage());
        }
    }


}
