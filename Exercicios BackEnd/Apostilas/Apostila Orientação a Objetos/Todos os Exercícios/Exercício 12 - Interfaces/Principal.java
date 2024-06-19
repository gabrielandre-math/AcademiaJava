import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do individuo: ");
        String nome = sc.nextLine();
        System.out.println("Digite a data do individuo: ");
        String data = sc.nextLine();
        System.out.println("Digite o horário: ");
        String horario = sc.nextLine();

        Pessoal pessoal = new Pessoal();
        pessoal.setNome(nome);
        pessoal.setData(data);
        pessoal.setHora(horario);

        Profissional profissional = new Profissional();
        profissional.setNome(nome);
        profissional.setData(data);
        profissional.setHora(horario);

        //Saída de dados
        pessoal.exibeCompromissoPessoal();
        profissional.exibeCompromissoProfissional();
    }
}
