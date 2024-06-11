package solução;
import java.util.Scanner;
class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        int controller = 0;
        do {
            try {
                person.initialScreen();
                controller = sc.nextInt();
                if (controller < 1 || controller > 3) {
                    throw new EntradaInvalidaException("Entrada inválida! Digite apenas [ 1 ], [ 2 ] ou [ 3 ].");
                }
                switch (controller) {
                    case 1:
                        db.insertPerson(person.inputData());
                        break;
                    case 2:
                        db.listPerson();
                        break;
                    case 3:
                        db.listPerson();
                        sc.nextLine();
                        System.out.println("Digite o nome do indivíduo que você quer deletar: ");
                        String name = sc.nextLine();
                        db.removePersonByName(name);
                        break;
                    default:
                        System.out.println("Você saiu!");
                        break;
                }
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
                sc.nextLine(); // Limpa o buffer do Scanner
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine(); // Limpa o buffer do Scanner
            }
        } while(controller != 4);
    }
}
