public class Human extends Animal {
    private String name;
    private int age;

    //Constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human() {}

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O nome deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("A idade deve ser entre 0 e 100!");
        }
        this.age = age;
    }

   //Additional methods
    public String toSpeak() {
        return "Nem todos falam";
    }


}
