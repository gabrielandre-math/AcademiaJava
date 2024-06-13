public class Person {
    private String name;
    private int age;
    private String telephone;

    //Constructors
    public Person() {}
    public Person(String name, int age, String telephone) {
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getTelephone() {
        return telephone;
    }

    //Setters
    public void setName(String name) {
        this.name = verifyString(name);
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("A idade deve ser entre 0 e 100!");
        }
        this.age = age;
    }
    public void setTelephone(String telephone) {
        if (telephone == null || telephone.trim().isEmpty() || !telephone.matches("[0-9]+")) {
            throw new IllegalArgumentException("O telefone deve conter 10 números, inclusive o 9 na frente!");
        }
        this.telephone = telephone;
    }

    //Additional methods
    public void show() {
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Telefone: " + getTelephone());
    }
    public String verifyString(String x) {
        if (x == null || x.trim().isEmpty() || !x.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new IllegalArgumentException("Precisa ser preenchido apenas com letras e não pode ser vazio");
        }
        return x;
    }

}
