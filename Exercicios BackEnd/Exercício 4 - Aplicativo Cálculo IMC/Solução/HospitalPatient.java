package Solução;

import java.util.Scanner;

public class HospitalPatient {
    private String name;
    private double weight;
    private double height;

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
        if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z a-z, espaços e não pode ser vazio!");
        }
        this.name = name;
    }
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("O peso deve ser um número positivo!");
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("A altura deve ser um número positivo!");
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
