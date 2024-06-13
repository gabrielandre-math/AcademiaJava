public class Animal {
    private String type;

    //Constructor
    public Animal(String type) {
        this.type = type;
    }
    public Animal() {}

    //Getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty() || !type.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("O tipo deve conter apenas letras de A-Z e não pode ser nulo ou vazio!");
        }
        this.type = type;
    }
    //Additional methods
    public String toWalk() {
        return "Todos andam, mas o modo é variado.";
    }

}
