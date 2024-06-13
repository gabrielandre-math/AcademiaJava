public class Disciplina {
    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.nome = "Lucas Schlestein";

        Laboratorio lab = new Laboratorio();
        lab.local = "Sala 2";

        System.out.println("O nome do professor é: " + prof.nome);
        System.out.println("O local da aula é: " + lab.local);
    }
}
