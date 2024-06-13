public class Teacher extends Person {
    private String id;
    private Double salary;

    //Constructor
    public Teacher() {}
    public Teacher(String name, int rg, String id, Double salary) {
        super(name, rg);
        this.id = id;
        this.salary = salary;
    }

    //Getters
    public String getId() {
        return id;
    }
    public Double getSalary() {
        return salary;
    }

    //Setters
    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("O salário deve ser maior do que zero!");
        }
        this.salary = salary;
    }
    public void setId(String id) {
        if (id == null || id.trim().isEmpty() || !id.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("O id deve ser de 9 digitos e apenas numérico não deve ser vazio também!");
        }
        this.id = id;
    }


    //Additional methods
    public void show() {
        super.show();
        System.out.println("Id: " + getId());
        System.out.println("Salário: " + getSalary());
    }
}

