package Solução;

import java.util.Scanner;

public class HospitalPatient {
    protected String name;
    protected double weight;
    protected double height;

    //Constructors
    public HospitalPatient() {}
    public HospitalPatient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public HospitalPatient(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public HospitalPatient(String name) {
        this.name = name;
    }
    public HospitalPatient(double weight) {
        this.weight = weight;
    }

    //Getters
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Não foi possível alterar o peso");
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Não foi possível alterar a altura");
        }
    }

    //Additional methods
    public HospitalPatient inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do paciente: ");
        setName(sc.nextLine());
        System.out.println("Digite a altura: ");
        setHeight(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o peso: ");
        setWeight(Double.parseDouble(sc.nextLine()));
        return new HospitalPatient(this.name, this.weight, this.height);
    }

}
