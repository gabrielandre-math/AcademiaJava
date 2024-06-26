package Solução;

import java.util.Calendar;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String yearPublication;

    //Constructors
    public Book() {}
    public Book(String title, String author, String yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title) {
        this.title = title;
    }
    //Getters
    public String getTitle() {
        return title;
    }
    public String getYearPublication() {
        return yearPublication;
    }
    public String getAuthor() {
        return author;
    }
    //Setters
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty() || !author.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O autor deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.author = author;
    }
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty() || !title.matches("[A-Za-zÀ-ÖØ-öø-ÿ0-9 ]+")) {
            throw new IllegalArgumentException("O título deve conter apenas letras de A-Z (é permitido números também) e não pode ser nulo ou vazio");
        }
        this.title = title;
    }
    public void setYearPublication(String yearPublication) {
        if (yearPublication == null || !yearPublication.matches("\\d{4}")) {
            throw new IllegalArgumentException("O ano de publicação do livro deve ser um ano válido de quatro dígitos!");
        }
        int year = Integer.parseInt(yearPublication);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > currentYear) {
            throw new IllegalArgumentException("O ano de publicação do livro não pode ser no futuro!");
        }
        this.yearPublication = yearPublication;
    }

    //Additional methods
    public Book inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        setTitle(sc.nextLine());
        System.out.println("Digite o autor: ");
        setAuthor(sc.nextLine());
        System.out.println("Digite o ano do livro: ");
        setYearPublication(sc.nextLine());
        return new Book(this.title, this.author, this.yearPublication);
    }

}
