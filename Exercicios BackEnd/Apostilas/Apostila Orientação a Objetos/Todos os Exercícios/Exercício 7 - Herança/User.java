public class User {
    private String name;
    private String email;
    private String telephone;

    // Construtor
    public User(String nome, String email, String telefone) {
        this.name = nome;
        this.email = email;
        this.telephone = telefone;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,4}$")) {
            throw new IllegalArgumentException("O e-mail não é válido!");
        }
        this.email = email;
    }

    public void setTelephone(String telephone) {
        if (telephone == null || telephone.trim().isEmpty() || !telephone.matches("\\d+")) {
            throw new IllegalArgumentException("O telefone deve conter apenas números!");
        }
        this.telephone = telephone;
    }

}
