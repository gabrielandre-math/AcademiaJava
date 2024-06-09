package Solução;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("HealthCare");
        int control = 0;
        do {
            hospital.initialScreen();
            Scanner sc = new Scanner(System.in);
            control = sc.nextInt();
            switch (control) {
                case 1:
                    HospitalPatient hospitalPatient = new HospitalPatient();
                    hospital.addHospitalPatientIntoHospital(hospitalPatient.inputData());
                    break;
                case 2:
                    hospital.listHospitalPatients();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (control != 3);
    }
}
