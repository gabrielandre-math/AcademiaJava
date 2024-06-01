package Solução;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("Cultura");
        Book objBook = new Book();
        int controller = 0;
        Scanner sc = new Scanner(System.in);
        do {
            library.viewInitialScreen();
            controller = sc.nextInt();
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
        } while (controller != 0);
    }
}
