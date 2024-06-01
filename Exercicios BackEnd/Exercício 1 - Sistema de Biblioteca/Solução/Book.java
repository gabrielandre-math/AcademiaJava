package Solução;

import java.util.Scanner;

public class Book {
    protected String title;
    protected String author;
    protected String yearPublication;

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
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    //Additional methods
    public Book inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        title = sc.nextLine();
        System.out.println("Digite o autor: ");
        author = sc.nextLine();
        return new Book(title, author);
    }

}
