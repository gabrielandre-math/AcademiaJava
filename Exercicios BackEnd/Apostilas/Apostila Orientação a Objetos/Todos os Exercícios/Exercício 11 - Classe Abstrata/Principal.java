import java.util.Scanner;

public class Principal extends Mensagem {
    public static void main(String[] args) {
        Principal p = new Principal();
        p.exibeMensagemA();
        p.exibeMensagemB();
    }

    @Override
    public void exibeMensagemA() {
        System.out.println("Cuide bem dos animais");
    }

    @Override
    public void exibeMensagemB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a mensagem: ");
        String mensagem = sc.nextLine();
        System.out.println(mensagem);
    }
}
