package Solução;
import java.util.Scanner;
class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart voidCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int controller = 0;
        do {
            try {
                cart.initialScreen();
                controller = sc.nextInt();
                if (controller < 1 || controller > 4) {
                    throw new EntradaInvalidaException("Entrada inválida! Digite apenas [ 1 ], [ 2 ], [ 3 ] ou [ 4 ].");
                }
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
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Limpa o buffer do Scanner
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer do Scanner
            }
        } while (controller != 4);
    }
}
