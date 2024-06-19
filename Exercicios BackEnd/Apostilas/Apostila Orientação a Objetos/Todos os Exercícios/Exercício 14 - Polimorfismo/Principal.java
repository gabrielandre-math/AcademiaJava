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
