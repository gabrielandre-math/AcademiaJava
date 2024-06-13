# Herança
## Exercício 10
**Descrição**: Escreva um programa orientado a objetos baseado no diagrama de classes da UML apresentado abaixo:
![image](https://github.com/gabrielandre-math/AcademiaJava/assets/60861872/92152e07-dd42-4350-91b7-962351c4197b)
Crie um objeto de cada classe, e apresente os resultados de cada uma delas na tela.
> Dica: Para passar os parâmetros da sub-classe para a super-classe utilize o método super(parâmetros).

## Solução
Classe **Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();

        Scanner sc = new Scanner(System.in);

        // Person data input
        System.out.println("Digite um nome: ");
        person.setName(sc.nextLine());
        System.out.println("Digite o rg: ");
        person.setRg(sc.nextInt());
        sc.nextLine();  

        // Student data input
        System.out.println("Digite um nome: ");
        student.setName(sc.nextLine());
        System.out.println("Digite o rg: ");
        student.setRg(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a matrícula: ");
        student.setId(sc.nextLine());

        // Teacher data input
        System.out.println("Digite um nome: ");
        teacher.setName(sc.nextLine());
        System.out.println("Digite o rg: ");
        teacher.setRg(sc.nextInt());
        sc.nextLine();
        System.out.println("Digite a matrícula: ");
        teacher.setId(sc.nextLine());
        System.out.println("Digite o salário: ");
        teacher.setSalary(sc.nextDouble());
        sc.nextLine();

        // Displaying the data
        System.out.println("Pessoa: ");
        person.show();
        System.out.println("Aluno: ");
        student.show();
        System.out.println("Professor: ");
        teacher.show();
    }
}
~~~
Classe **Person**
~~~java
public class Person {
    protected String name;
    protected int rg;

    //Constructors
    public Person(String name, int rg) {
        this.name = name;
        this.rg = rg;
    }
    public Person() {}

    //Getters
    public String getName() {
        return name;
    }
    public int getRg() {
        return rg;
    }

    //Setters
    public void setName(String name) {
        this.name = verifyInput(name);
    }
    public void setRg(int rg) {
        String rgStr = Integer.toString(rg);
       if (rgStr == null || rgStr.trim().isEmpty() || !rgStr.matches("\\d+")) {
           throw new IllegalArgumentException("O RG precisa ser do tipo numérico!");
       }
       if (!rgStr.matches("[0-9]+")) {
           throw new IllegalArgumentException("O RG precisa ter 9 algarismos!");
       }
       rg = Integer.parseInt(rgStr);
       this.rg = rg;
    }

    //Additional methods
    public String verifyInput(String x) {
        if (x == null || x.trim().isEmpty() || !x.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("Precisa ser preenchido apenas com letras e não pode ser vazio");
        }
        return x;
    }
    void show() {
        System.out.println("Nome: " + getName());
        System.out.println("RG: " + getRg());
    }
}
~~~
Classe **Student**
~~~java
import java.util.Scanner;

public class Student extends Person {
    private String id;

    //Constructors
    public Student() {}
    public Student(String name, int rg, String id){
        super(name, rg);
        this.id = id;
    }

    //Getters
    public String getId() {
        return id;
    }
    //Setter
    public void setId(String id) {
        if (id == null || id.trim().isEmpty() || !id.matches("[0-9]{9}")){
            throw new IllegalArgumentException("A matrícula precisa ter 9 digitos e ser um número!");
        }
        this.id = id;
    }

    //Additional method
    public Student Student(String name, String rg, int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setName(sc.nextLine());
        System.out.println("Digite a matricula: ");
        setId(sc.nextLine());
        System.out.println("Digite o rg: ");
        setRg(sc.nextInt());
        return new Student(getName(), getRg(), getId());
    }
    public void show() {
        super.show();
        System.out.println("Matrícula: " + getId());
    }
}
~~~
Classe **Teacher**
~~~java
public class Teacher extends Person {
    private String id;
    private Double salary;

    //Constructor
    public Teacher() {}
    public Teacher(String name, int rg, String id, Double salary) {
        super(name, rg);
        this.id = id;
        this.salary = salary;
    }

    //Getters
    public String getId() {
        return id;
    }
    public Double getSalary() {
        return salary;
    }

    //Setters
    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("O salário deve ser maior do que zero!");
        }
        this.salary = salary;
    }
    public void setId(String id) {
        if (id == null || id.trim().isEmpty() || !id.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("O id deve ser de 9 digitos e apenas numérico não deve ser vazio também!");
        }
        this.id = id;
    }


    //Additional methods
    public void show() {
        super.show();
        System.out.println("Id: " + getId());
        System.out.println("Salário: " + getSalary());
    }
}
~~~

Criado por _Gabriel André._
