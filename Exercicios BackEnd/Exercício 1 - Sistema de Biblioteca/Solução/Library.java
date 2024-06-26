package Solução;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private String name;
    List<Book> books = new ArrayList<Book>();

    //Constructor
    public Library(String name){
        this.name = name;
    }
    //Getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ0-9 ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z (é permitido números também), a-z e não pode ser vazio!");
        }
        this.name = name;
    }
    //Additional methods
    public void addBook(Book book) {
        books.add(book);
    }
    public void listBook() {
        int i = 0;
        if (books.isEmpty()) {
            System.out.println("Livro não encontrado!");
        } else {
            System.out.println("Livros cadastrados: ");
            for (Book book : books) {
                i++;
                System.out.println("Livro número " + i);
                System.out.println("___________________________________");
                System.out.println("Título: " + book.getTitle() + " \nAutor: " + book.getAuthor());
                System.out.println("Ano de publicação: " + book.getYearPublication());
                System.out.println("___________________________________");
            }
        }
    }
    public void viewInitialScreen() {
        System.out.println("SISTEMA CADASTRAL BIBLIOTECA");
        System.out.println("Selecione a opção desejada:");
        System.out.println("[ 1 ] - CADASTRAR LIVRO");
        System.out.println("[ 2 ] - LISTAR LIVRO(S)");
        System.out.println("[ 3 ] - SAIR");
        System.out.println("Digite uma opção: ");
    }
}
