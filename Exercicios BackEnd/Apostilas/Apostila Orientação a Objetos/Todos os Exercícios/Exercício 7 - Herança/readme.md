# Herança
## Exercício 7
**Descrição**: Crie uma classe **Principal** para solicitar e exibir na tela as informações de nome, e-mail e telefone do usuário. 

Esses atributos são herdados da classe **Usuario**.

## Solução
Classe **Main**
~~~java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.println("Digite o e-mail do usuário: ");
        String email = sc.nextLine();

        System.out.println("Digite o telefone do usuário: ");
        String telefone = sc.nextLine();

        User usuario = new User(nome, email, telefone);

        System.out.println("Informações do Usuário:");
        System.out.println("Nome: " + usuario.getName());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelephone());
    }
}

~~~
Classe **User**
~~~java
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
~~~


Criado por _Gabriel André._
