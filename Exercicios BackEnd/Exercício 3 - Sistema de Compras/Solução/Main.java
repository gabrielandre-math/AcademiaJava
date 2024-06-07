package Solução;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        int controller = 0;
        do {
            cart.initialScreen();
            controller = sc.nextInt();
            switch (controller) {
                case 1:
                    cart.addProductIntoShoppingCart(product.addProduct());
                    break;
                case 2:
                    cart.listProductsInShoppingCart();
                    System.out.println("_____________________________________");
                    System.out.printf("Total do carrinho: R$%.2f", cart.countProductsInCart());
                    System.out.println();
                    break;
                default:
                    System.out.println("Você saiu!");
                    break;
            }
        } while (controller != 3);
    }
}
