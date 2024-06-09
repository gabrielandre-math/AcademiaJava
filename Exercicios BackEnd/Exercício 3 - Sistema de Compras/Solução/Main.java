package Solução;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart voidCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int controller = 0;
        do {
            cart.initialScreen();
            controller = sc.nextInt();
            switch (controller) {
                case 1:
                    Product product = new Product();
                    voidCart.addProductIntoShoppingCart(product.addProduct());
                    break;
                case 2:
                    if (voidCart.isVoid() > 0) {
                        voidCart.listProductsInShoppingCart();
                        System.out.println("Digite o nome do produto que você deseja adicionar ao carrinho: ");
                        sc.nextLine();
                        String nameProduct = sc.nextLine();
                        Product removeProduct = voidCart.removeProductByName(nameProduct);
                        if (removeProduct != null) {
                            cart.addProductIntoShoppingCart(removeProduct);
                            System.out.println("Produto adicionado ao carrinho");
                        }
                    } else {
                        System.out.println("Você não tem produtos para adicionar ao carrinho");
                    }
                    break;
                case 3:
                    cart.listProductsInShoppingCart();
                    System.out.println("_____________________________________");
                    System.out.printf("Total do carrinho: R$%.2f", cart.countProductsInCart());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Se você quer sair digite 4");
                    break;
            }
        } while (controller != 4);
    }
}
