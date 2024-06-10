package solução;

import java.util.Scanner;

public class Person {
    protected String name;
    protected double salary;
    //Constructors
    public Person() {}
    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(double salary) {
        this.salary = salary;
    }
    public Person(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    //Getters
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    };
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Operação não permitida!");
        }
    }
    //Additional methods
    public void showInformations() {
        System.out.println(getName() + " seu salário é R$" + getSalary() + " ");
    }
    public Person inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        setName(sc.nextLine());
        System.out.print("Salário: ");
        setSalary(sc.nextDouble());
        return new Person(this.getName(), this.getSalary());
    }
    public void initialScreen() {
        System.out.println("-- Aplicativo para calcular IR --");
        System.out.println("[ 1 ] - Cadastrar indivíduo");
        System.out.println("[ 2 ] - Listar indivíduos cadastrados na base de dados e checar seus impostos");
        System.out.println("[ 3 ] - Excluir indivíduo");
        System.out.println("[ 4 ] - Sair");
        System.out.println("Digite uma opção: ");
    }
}
