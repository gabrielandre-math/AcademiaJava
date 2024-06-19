# Polimorfismo
## Exercício 14
**Descrição**: Crie uma classe para armazenar os atributos nome e email do usuário em um arquivo texto, em que o nome do arquivo é o mesmo nome do usuário que foi digitado. Essa classe deverá permitir a sobrecarga de métodos, em que o usuário poderá gravar o nome e o email no arquivo, ou somente o nome. 

Crie uma classe **Principal** para realizar a leitura dos atributos. Se ambos os atributos forem preenchidos a sobrecarga deverá ser uma. Se apenas o nome do usuário for preenchido, então a sobrecarga deverá ser outra. Além disso, ofereça ao usuário a opção de ler o conteúdo do arquivo de acordo com um nome por ele informado.

## Solução
Classe **Usuario**
~~~java
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void gravarNoArquivo() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(nome + ".txt"));
            writer.write("Nome: " + nome + "\n");
            if (email != null) {
                writer.write("Email: " + email + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
~~~
Classe **Principal**
~~~java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();

        System.out.println("Deseja digitar o email? (s/n): ");
        String resposta = sc.nextLine();

        Usuario usuario;

        if (resposta.equalsIgnoreCase("s")) {
            System.out.println("Digite o email do usuário:");
            String email = sc.nextLine();
            usuario = new Usuario(nome, email);
        } else {
            usuario = new Usuario(nome);
        }
        usuario.gravarNoArquivo();
        System.out.println("Deseja ler o conteúdo do arquivo? (s/n):");
        String lerArquivo = sc.nextLine();
        if (lerArquivo.equalsIgnoreCase("s")) {
            lerArquivo(nome);
        }
    }
    public static void lerArquivo(String nome) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(nome + ".txt"));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
~~~

Criado por _Gabriel André._
