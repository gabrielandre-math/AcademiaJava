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
