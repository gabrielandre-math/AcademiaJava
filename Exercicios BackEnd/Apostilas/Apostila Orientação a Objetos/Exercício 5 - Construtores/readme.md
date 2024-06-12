# Construtores
## Exercício 5
**Descrição**: Criar uma classe chamada **Pessoa** com 2 construtores, um que receba um nome e a cidade da pessoa e outro recebendo apenas a idade. Solicite ao usuário qual dos construtores ele gostaria de utilizar na instanciação da classe.

Além de receber parâmetros, os construtores imprimem na tela o conteúdo dos parâmetros recebidos.

## Solução
**Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonService personService = new PersonService();
        System.out.println("Qual construtor você quer usar: ");
        System.out.println("[ 1 ] - Pessoa(String name, String city)]");
        System.out.println("[ 2 ] - Pessoa(String city)");
        System.out.println("Selecione uma opção: ");
        int controller = sc.nextInt();
        switch (controller) {
            case 1:
                personService.inputData(1);
                personService.listData();
                break;
            case 2:
                personService.inputData(2);
                personService.listData();
                break;
            default:
                personService.inputData(3);
        }
    }
}
~~~
**Classe Person**
~~~java
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
~~~
**Classe PersonService**
~~~java
import java.util.Scanner;

public class PersonService {
    Scanner sc = new Scanner(System.in);
    String name;
    String city;
    Person person = new Person(this.name, this.city);
    Person person2 = new Person(this.city);

    public Person inputDataCase(int i) {
        if (i == 1) {
            System.out.print("Nome: ");
            person.setName(sc.nextLine());
            System.out.print("Cidade: ");
            person.setCity(sc.nextLine());
            return person;
        }
        if (i == 2) {
            System.out.print("Cidade: ");
            person2.setCity(sc.nextLine());
            return person2;
        }
        return null;
    }
    public Person inputData(int i) {
        if (i == 1) {
            inputDataCase(1);
        }
        if (i == 2) {
            inputDataCase(2);
        }
        return null;
    }
    public void listData() {
        if (person.getName() != null || person.getCity() != null) {
            System.out.println(person.getName() + " " + person.getCity());
        }
        if (person2.getCity() != null) {
            System.out.println(person2.getCity());
        }
    }
}

~~~

Criado por _Gabriel André._
