package Solução;

import java.util.Scanner;

public class Product {
  protected String name;
  protected double price;
  protected int quantityProducts = 0;

  //Constructor
  public Product(){};
  public Product(String name, double price, int quantityProducts) {
      this.name = name;
      this.price = price;
      this.quantityProducts = quantityProducts;
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

  //Additional methods
  public Product addProduct() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Nome: ");
      setName(sc.nextLine());
      System.out.println("Valor: ");
      setPrice(sc.nextDouble());
      System.out.println("Quantidade: ");
      setQuantityProducts(sc.nextInt());
      return new Product(this.name, this.price, this.quantityProducts);
  }
}
