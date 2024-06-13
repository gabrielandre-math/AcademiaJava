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
