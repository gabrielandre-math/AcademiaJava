public class Profissional extends Compromisso implements InterfaceEnunciado {

    @Override
    public void exibeCompromissoProfissional() {
            System.out.println("Compromisso: ");
            System.out.println(getNome());
            System.out.println(getData());
            System.out.println(getHora());
    }
}
