import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.println("Digite o e-mail do usuário: ");
        String email = sc.nextLine();

        System.out.println("Digite o telefone do usuário: ");
        String telefone = sc.nextLine();

        User usuario = new User(nome, email, telefone);

        System.out.println("Informações do Usuário:");
        System.out.println("Nome: " + usuario.getName());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelephone());
    }
}
