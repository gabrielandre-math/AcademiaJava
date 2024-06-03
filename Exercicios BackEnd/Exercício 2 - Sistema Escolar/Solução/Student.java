import java.util.Scanner;

public class Student {
    protected String name;
    protected int age;
    protected String id;

    //Constructor
    public Student(){
    }
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    public Student(int age, String id, String name) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Não foi possível alterar a idade!");
        }
    }
    public void setId(String id) {
        if (id.matches("\\d+")) {
            this.id = id;
        } else {
            System.out.println("Você não digitou um número!");
        }
    }
    //Additional method
    public Student addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        setName(sc.nextLine());
        System.out.print("Idade: ");
        setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Id: ");
        setId(sc.nextLine());
        return new Student(this.name, this.age, this.id);
    }
}
