import java.util.Scanner;

public class Person {
    private String name;
    private String city;

    //Constructors
    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public Person(String city) {
        this.city = city;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getCity() {
            return city;
    }

    //Setters

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z a-z, espaços e não pode ser vazio!");
        }
        this.name = name;
    }
    public void setCity(String city) {
        if (city == null || city.trim().isEmpty() || !city.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("A cidade deve conter apenas letras de A-Z a-z, espaços e não pode ser vazio!");
        }
        this.city = city;
    }




}

