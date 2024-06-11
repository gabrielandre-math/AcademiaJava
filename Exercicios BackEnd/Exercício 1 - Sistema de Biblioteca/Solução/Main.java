package Solução;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library("Cultura");
        Book objBook = new Book();
        int controller = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                library.viewInitialScreen();
                controller = sc.nextInt();
                if (controller < 0) {
                    throw new EntradaInvalidaException("Entrada inválida! Por favor, digite um número positivo.");
                }
                if (controller == 1) {
                    int qtdLivros = 0;
                    System.out.println("Digite a quantidade de livros:");
                    qtdLivros = sc.nextInt();
                    System.out.println("Biblioteca " + library.getName());
                    for(int i = 0; i < qtdLivros; i++) {
                        library.addBook(objBook.inputData());
                    }
                }
                else if (controller == 2) {
                    library.listBook();
                }
                else {
                    System.out.println("Você saiu!");
                    break;
                }
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Limpa o buffer do Scanner
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer do Scanner
            }
        } while (controller != 3);
    }
}
