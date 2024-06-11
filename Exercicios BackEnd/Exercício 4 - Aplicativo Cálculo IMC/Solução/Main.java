package Solução;

import java.util.Scanner;
class EntradaInvalidaException extends Exception {
    public EntradaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("HealthCare");
        Scanner sc = new Scanner(System.in);
        int control = 0;
        do {
            try {
                hospital.initialScreen();
                control = sc.nextInt();
                if (control < 1 || control > 3) {
                    throw new EntradaInvalidaException("Entrada inválida! Digite apenas [ 1 ], [ 2 ] ou [ 3 ].");
                }
                switch (control) {
                    case 1:
                        HospitalPatient hospitalPatient = new HospitalPatient();
                        hospital.addHospitalPatientIntoHospital(hospitalPatient.inputData());
                        break;
                    case 2:
                        hospital.listHospitalPatients();
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
        } while (control != 3);
    }
}
