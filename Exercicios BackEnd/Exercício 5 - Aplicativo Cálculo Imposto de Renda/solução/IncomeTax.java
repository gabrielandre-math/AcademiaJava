package solução;

public class IncomeTax {
    private Person person;
    private IncomeTaxBand incomeTaxBand;
    private double taxPayable;
    private int band;
    //Constructor
    public IncomeTax(Person person) {
        this.person = person;
        this.incomeTaxBand = new IncomeTaxBand(person);
    }

    //Additional methods
    public void calculate() {
        double salary = person.getSalary();
        band = incomeTaxBand.getIncomeTaxBand();

        switch (band) {
            case 1:
                taxPayable = 0;
                break;
            case 2:
                taxPayable = (salary - 2112.00) * 0.075;
                break;
            case 3:
                taxPayable = (salary - 2826.66) * 0.15 + (2826.66 - 2112.00) * 0.075;
                break;
            case 4:
                taxPayable = (salary - 3751.06) * 0.225 + (3751.06 - 2826.66) * 0.15 + (2826.66 - 2112.00) * 0.075;
                break;
            case 5:
                taxPayable = (salary - 4664.68) * 0.275 + (4664.68 - 3751.06) * 0.225 + (3751.06 - 2826.66) * 0.15 + (2826.66 - 2112.00) * 0.075;
                break;
            default:
                taxPayable = 0;
                break;
        }
    }
    public void show() {
        person.showInformations();
        System.out.print("sua faixa de imposto é " + band + " ");
        System.out.printf("e o valor do imposto de renda a ser pago é: R$%.2f\n", taxPayable);

    }
}
