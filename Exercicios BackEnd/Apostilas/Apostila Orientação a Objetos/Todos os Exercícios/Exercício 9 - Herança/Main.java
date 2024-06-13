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
