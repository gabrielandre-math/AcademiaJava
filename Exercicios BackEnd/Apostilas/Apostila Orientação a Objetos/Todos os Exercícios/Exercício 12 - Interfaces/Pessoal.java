
public class Pessoal extends Compromisso implements InterfaceEnunciadoDois {

    @Override
    public void exibeCompromissoPessoal() {
        System.out.println("Compromisso: ");
        System.out.println(getNome());
        System.out.println(getData());
        System.out.println(getHora());
    }
}
