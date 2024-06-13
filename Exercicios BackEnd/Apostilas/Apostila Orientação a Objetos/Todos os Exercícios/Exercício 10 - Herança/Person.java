public class Person {
    protected String name;
    protected int rg;

    //Constructors
    public Person(String name, int rg) {
        this.name = name;
        this.rg = rg;
    }
    public Person() {}

    //Getters
    public String getName() {
        return name;
    }
    public int getRg() {
        return rg;
    }

    //Setters
    public void setName(String name) {
        this.name = verifyInput(name);
    }
    public void setRg(int rg) {
        String rgStr = Integer.toString(rg);
       if (rgStr == null || rgStr.trim().isEmpty() || !rgStr.matches("\\d+")) {
           throw new IllegalArgumentException("O RG precisa ser do tipo numérico!");
       }
       if (!rgStr.matches("[0-9]+")) {
           throw new IllegalArgumentException("O RG precisa ter 9 algarismos!");
       }
       rg = Integer.parseInt(rgStr);
       this.rg = rg;
    }

    //Additional methods
    public String verifyInput(String x) {
        if (x == null || x.trim().isEmpty() || !x.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("Precisa ser preenchido apenas com letras e não pode ser vazio");
        }
        return x;
    }
    void show() {
        System.out.println("Nome: " + getName());
        System.out.println("RG: " + getRg());
    }

}
