package Solução;

import java.util.Scanner;

public class Product {
  private String name;
  private double price;
  private int quantityProducts = 0;
  private double subTotal = 0;
  //Constructor
  public Product(){};
  public Product(String name, double price, int quantityProducts, double subTotal) {
      this.name = name;
      this.price = price;
      this.quantityProducts = quantityProducts;
      this.subTotal = subTotal;
  }
  public Product(String name, double price) {
      this.name = name;
      this.price = price;
  }
  public Product(String name) {
      this.name = name;
  }
  public Product(double price) {
      this.price = price;
  }
  public Product(int quantityProducts) {
      this.quantityProducts = quantityProducts;
  }
  //Getters
  public String getName() {
      return name;
  }
  public double getPrice() {
      return price;
  }
  public int getQuantityProducts() {
      return quantityProducts;
  }
  public double getSubTotal() {
      return subTotal;
  }
  //Setters
  public void setName(String name) {
      if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
          throw new IllegalArgumentException("O nome deve conter apenas letras e espaços e não pode ser vazio!");
      } else {
          this.name = name;
      }
  }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        }
    }

    public void setQuantityProducts(int quantityProducts) {
        if (quantityProducts >= 0) {
            this.quantityProducts = quantityProducts;
        } else {
            throw new IllegalArgumentException("A quantidade de produtos não pode ser negativa!");
        }
    }

  //Additional methods
  public Product addProduct() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nome: ");
      setName(sc.nextLine());
      System.out.println("Valor: ");
      setPrice(sc.nextDouble());
      System.out.println("Quantidade: ");
      setQuantityProducts(sc.nextInt());
      return new Product(this.name, this.price, this.quantityProducts, this.subTotal);
  }
}
