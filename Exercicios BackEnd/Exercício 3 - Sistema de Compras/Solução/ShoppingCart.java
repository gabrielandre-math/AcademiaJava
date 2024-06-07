package Solução;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products = new ArrayList<>();
    protected double totalPrice = 0;
    //Construtor
    public ShoppingCart() {}
    public ShoppingCart(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    //Getters
    public double getTotalPrice() {
        return totalPrice;
    }
    //Setters
    public void setTotalPrice(double totalPrice) {
        if (totalPrice >= 0) {
            this.totalPrice = totalPrice;
        } else {
            System.out.println("Erro ao efetuar o total");
        }
    }
    //Additional methods
    public void addProductIntoShoppingCart(Product product) {
        products.add(product);
    }
    public void listProductsInShoppingCart() {
        if (products.isEmpty()) {
            messageCart();
        } else {
            listProductsInCart();
        }
    }
    public void messageCart() {
        System.out.println("Nenhum produto cadastrado no carrinho");
    }
    public void listProductsInCart() {
        int i = 0;
        for (Product product : products) {
            i++;
            System.out.println("________________________________________");
            System.out.println("Produto " + i + ": " + product.getName());
            System.out.println("________________________________________");
            System.out.println("Nome: " + product.getName());
            System.out.println("Valor: " + product.getPrice());
            System.out.println("Quantidade: " + product.getQuantityProducts());
            System.out.println("Subtotal: " + product.getQuantityProducts() * product.getPrice());
        }
    }
    public double countProductsInCart() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice() * product.getQuantityProducts();
        }
        return totalPrice;
    }
    public void countProductsInShoppingCart() {
        if (products.isEmpty()) {
            messageCart();
        } else {
            listProductsInShoppingCart();
        }
    }


    public void initialScreen() {
        System.out.println("Digite a opção: ");
        System.out.println("[ 1 ] - Cadastrar produto");
        System.out.println("[ 2 ] - Listar produtos cadastrados no carrinho");
        System.out.println("[ 3 ] - Sair");
        System.out.print("Digite uma opção: ");
    }
}
