package solução;

import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Person> people = new ArrayList<>();

    //Additional methods
    public void insertPerson(Person person) {
        people.add(person);
    }
    public Person removePersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                people.remove(person);
                System.out.println("O indíviduo " + name + " foi removido com sucesso!");
                return person;
            }
        }
        System.out.println("O indíviduo " + name + " não existe!");
        return null;
    }
    public void listPerson() {
        int index = 0;
        for (Person person : people) {
            index++;
            System.out.println();
            System.out.printf("-------- Indivíduo [%d] --------\n", index);
            System.out.println("Nome: " + person.getName());
            System.out.println("Salário: " + person.getSalary());
            IncomeTax incomeTax = new IncomeTax(person);
            incomeTax.calculate();
            incomeTax.show();
        }
    }
}
