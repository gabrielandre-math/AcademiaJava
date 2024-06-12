import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonService personService = new PersonService();
        System.out.println("Qual construtor você quer usar: ");
        System.out.println("[ 1 ] - Pessoa(String name, String city)]");
        System.out.println("[ 2 ] - Pessoa(String city)");
        System.out.println("Selecione uma opção: ");
        int controller = sc.nextInt();
        switch (controller) {
            case 1:
                personService.inputData(1);
                personService.listData();
                break;
            case 2:
                personService.inputData(2);
                personService.listData();
                break;
            default:
                personService.inputData(3);
        }
    }
}
