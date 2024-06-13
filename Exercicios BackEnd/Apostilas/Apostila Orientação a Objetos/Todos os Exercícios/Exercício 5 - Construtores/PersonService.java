import java.util.Scanner;

public class PersonService {
    Scanner sc = new Scanner(System.in);
    String name;
    String city;
    Person person = new Person(this.name, this.city);
    Person person2 = new Person(this.city);

    public Person inputDataCase(int i) {
        if (i == 1) {
            System.out.print("Nome: ");
            person.setName(sc.nextLine());
            System.out.print("Cidade: ");
            person.setCity(sc.nextLine());
            return person;
        }
        if (i == 2) {
            System.out.print("Cidade: ");
            person2.setCity(sc.nextLine());
            return person2;
        }
        return null;
    }
    public Person inputData(int i) {
        if (i == 1) {
            inputDataCase(1);
        }
        if (i == 2) {
            inputDataCase(2);
        }
        return null;
    }
    public void listData() {
        if (person.getName() != null && person.getCity() != null) {
            System.out.println(person.getName() + " " + person.getCity());
        }
        if (person2.getCity() != null) {
            System.out.println(person2.getCity());
        }
    }
}
