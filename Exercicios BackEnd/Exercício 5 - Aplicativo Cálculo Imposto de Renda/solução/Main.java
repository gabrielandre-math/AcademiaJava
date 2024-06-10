package solução;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        int controller = 0;
        do{
            person.initialScreen();
            controller = sc.nextInt();
            switch (controller){
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
        } while(controller != 4);
    }
}
