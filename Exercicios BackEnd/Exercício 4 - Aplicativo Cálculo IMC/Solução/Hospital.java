package Solução;
import java.util.ArrayList;
import java.util.List;
public class Hospital {
    List<HospitalPatient> hospitalPatients = new ArrayList<HospitalPatient>();
    List<Hospital> hospitals = new ArrayList<Hospital>();
    protected String name;
    //Constructor
    public Hospital() {}
    public Hospital(String name){
        this.name = name;
    }

    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Additional methods
    public void addHospitalPatientIntoHospital(HospitalPatient patient){
        hospitalPatients.add(patient);
    }
    public void addHospital(Hospital hospital){
        hospitals.add(hospital);
    }
    public void listHospitalPatients(){
        if (hospitalPatients.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado!");
        } else {
            for (HospitalPatient hospital : hospitalPatients) {
                System.out.println("________________________________________");
                System.out.println("Nome: " + hospital.getName());
                System.out.println("Altura: " + hospital.getHeight());
                System.out.println("Peso: " + hospital.getWeight());
                System.out.println("Diagnóstico: ");
                System.out.println(diagnostic(hospital, hospital.getHeight(), hospital.getWeight()));
            }
        }
    }
    //calcularIMC = calculateBMI
    //IMC (Índice de Massa Corporal); BMI (Body Mass Index)
    public double calculateBMI(double height, double weight){
        double BMI = 0;
        BMI = weight / (height * height);
        return BMI;
    }
    public String message(HospitalPatient hospitalPatient) {
        return "O diagnóstico do paciente " + hospitalPatient.getName() + " é";
    }
    public String messageBMI(int controller) {
        if (controller == 1) {
            return " Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        } else if (controller == 2) {
            return " Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
        } else if (controller == 3) {
            return " Baixo peso = IMC entre 17 e 18,49 kg/m²";
        } else if (controller == 4) {
            return " Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        } else if (controller == 5) {
            return " Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        } else if (controller == 6) {
            return " Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        } else if (controller == 7) {
            return " Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
        } else if (controller == 8) {
            return " Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
        } else {
            return "error";
        }
    }
    //Diagnostic
    public String diagnostic(HospitalPatient hospitalPatient, double height, double weight) {
        if (calculateBMI(height, weight) < 16) {
            return message(hospitalPatient) + messageBMI(1);
        } else if (calculateBMI(height, weight) >= 16 && calculateBMI(height, weight) < 17) {
            return message(hospitalPatient) + messageBMI(2);
        } else if (calculateBMI(height, weight) >= 17 && calculateBMI(height, weight) < 18.50) {
            return message(hospitalPatient) + messageBMI(3);
        } else if (calculateBMI(height, weight) >= 18.50 && calculateBMI(height, weight) < 25) {
            return message(hospitalPatient) + messageBMI(4);
        } else if (calculateBMI(height, weight) >= 25 && calculateBMI(height, weight) < 30) {
            return message(hospitalPatient) + messageBMI(5);
        } else if (calculateBMI(height, weight) >= 30 && calculateBMI(height, weight) < 35) {
            return message(hospitalPatient) + messageBMI(6);
        } else if (calculateBMI(height, weight) >= 35 && calculateBMI(height, weight) < 40) {
            return message(hospitalPatient) + messageBMI(7);
        } else {
            return message(hospitalPatient) + messageBMI(8);
        }
    }
    //Screen
    public void initialScreen() {
        System.out.println("--- APP DE IMC HEALTHCARE ----");
        System.out.println("[ 1 ] - Cadastrar e checar IMC");
        System.out.println("[ 2 ] - Listar pacientes cadastrados");
        System.out.println("[ 3 ] - Sair");
    }
}
