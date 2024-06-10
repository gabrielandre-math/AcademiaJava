package solução;

public class IncomeTaxBand {
    private Person person;

    //Constructor
    public IncomeTaxBand(Person person) {
        this.person = person;
    }
    public int getIncomeTaxBand() {
        double salary = person.getSalary();

        if(salary <= 2112.00) { // Isento
            return 1;
        } else if (salary <= 2826.66) { // 7,5%
            return 2;
        } else if (salary <= 3751.06) { // 15%
            return 3;
        } else if (salary <= 4664.68) { // 22,5%
            return 4;
        } else { // 27,5%
            return 5;
        }
    }
}
