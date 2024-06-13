# Herança
## Exercício 9
**Descrição**: Uma empresa está cadastrando seus funcionários em sua base de dados. Sabendo que **Funcionario** é
uma **Pessoa**, e que pessoas possuem (nome, idade e telefone), e que seus funcionários são divididos por (setor, cargo e função).

Crie uma classe executável, e cadastre 3 funcionários, preferencialmente solicitando as informações via console
ao usuário. Após esse cadastro, exiba esses funcionários na tela. A classe **Funcionario** deve herdar as características
da classe **Pessoa**.

## Solução
Classe **Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Digite o nome: ");
        emp.setName(sc.nextLine());
        System.out.println("Digite a idade: ");
        emp.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite o telefone: ");
        emp.setTelephone(sc.nextLine());
        System.out.println("Digite o setor: ");
        emp.setSector(sc.nextLine());
        System.out.println("Digite a posição: ");
        emp.setPosition(sc.nextLine());
        System.out.println("Digite a função: ");
        emp.setFunction(sc.nextLine());
        emp.show();
        sc.close();
    }
}
~~~

Classe **Person**
~~~java
public class Person {
    private String name;
    private int age;
    private String telephone;

    //Constructors
    public Person() {}
    public Person(String name, int age, String telephone) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getTelephone() {
        return telephone;
    }

    //Setters
    public void setName(String name) {
        this.name = verifyString(name);
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("A idade deve ser entre 0 e 100!");
        }
        this.age = age;
    }
    public void setTelephone(String telephone) {
        if (telephone == null || telephone.trim().isEmpty() || !telephone.matches("[0-9]+")) {
            throw new IllegalArgumentException("O telefone deve conter 10 números, inclusive o 9 na frente!");
        }
        this.telephone = telephone;
    }

    //Additional methods
    public void show() {
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Telefone: " + getTelephone());
    }
    public String verifyString(String x) {
        if (x == null || x.trim().isEmpty() || !x.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("Precisa ser preenchido apenas com letras e não pode ser vazio");
        }
        return x;
    }

}
~~~

Classe **Employee**
~~~java
public class Employee extends Person {
    private String sector;
    private String position;
    private String function;

    //Constructor
    public Employee() {
    }
    public Employee(String name, int age, String telephone, String sector, String position, String function) {
        super(name, age, telephone);
        this.sector = sector;
        this.position = position;
        this.function = function;
    }

    //Getters
    public String getSector() {
        return sector;
    }
    public String getPosition() {
        return position;
    }
    public String getFunction() {
        return function;
    }

    //Setters
    public void setSector(String sector) {
        this.sector = verifyString(sector);
    }
    public void setPosition(String position) {
        this.position = verifyString(position);
    }
    public void setFunction(String function) {
        this.function = verifyString(function);
    }

    //Additional methods
    public void show() {
        super.show();
        System.out.println("Sector: " + getSector());
        System.out.println("Position: " + getPosition());
        System.out.println("Function: " + getFunction());
    }
}
~~~

Criado por _Gabriel André._

