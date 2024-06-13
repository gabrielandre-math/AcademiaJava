# Herança
## Exercício 8
**Descrição**: Crie uma classe chamada **Pessoa** que herda da classe **SerHumano** os atributos nome e idade e o método falar. A classe **SerHumano** também possui herança e herda o atributo tipo e o o método andar da classe **Animal**. 

Desse modo, crie uma classe **Principal** para exibir na tela o conteúdo de todos os atributos e realizar a chamada de todos os métodos envolvidos no processo. O método falar retorna a string _"Nem todos falam"_ e o método andar imprime na tela a string _"Todos andam, mas o modo é variado."_. 

Solicite ao usuário para informar o nome, a idade e o tipo.

## Solução
Classe **Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        person.setName(nome);
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        person.setAge(idade);
        sc.nextLine();
        System.out.println("Digite o tipo: ");
        String tipo = sc.nextLine();
        person.setType(tipo);

        System.out.println("Nome: " + person.getName());
        System.out.println("Idade: " + person.getAge());
        System.out.println("Tipo: " + person.getType());
        System.out.println(person.toWalk());
        System.out.println(person.toSpeak());
    }
}

~~~
Classe **Person**
~~~java
public class Person extends Human {

}

~~~
Classe **Human**
~~~java
public class Human extends Animal {
    private String name;
    private int age;

    //Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human() {}

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("A idade deve ser entre 0 e 100!");
        }
        this.age = age;
    }

   //Additional methods
    public String toSpeak() {
        return "Nem todos falam";
    }
}

~~~
Classe **Animal**
~~~java
public class Animal {
    private String type;

    //Constructor
    public Animal(String type) {
        this.type = type;
    }
    public Animal() {}
    //Getter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (type == null || type.trim().isEmpty() || !type.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O tipo deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.type = type;
    }
    //Additional methods
    public String toWalk() {
        return "Todos andam, mas o modo é variado.";
    }

}
~~~

Criado por _Gabriel André._
