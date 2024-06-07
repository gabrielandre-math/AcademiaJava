package Solução;

import java.util.Scanner;

public class Product {
  protected String name;
  protected double price;
  protected int quantityProducts = 0;
  protected double subTotal = 0;
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
      this.name = name;
  }
  public void setPrice(double price) {
      if (price >= 0) {
          this.price = price;
      } else {
          System.out.println("Não foi possivel alterar!");
      }

  }
  public void setQuantityProducts(int quantityProducts) {
      if (quantityProducts >= 0) {
          this.quantityProducts = quantityProducts;
      } else {
          System.out.println("Não foi possivel alterar");
      }
  }
  public void setSubTotal(double subTotal) {
      if (subTotal >= 0) {
          this.subTotal = subTotal;
      } else {
          System.out.println("Não foi possível fazer a alteração!");
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
