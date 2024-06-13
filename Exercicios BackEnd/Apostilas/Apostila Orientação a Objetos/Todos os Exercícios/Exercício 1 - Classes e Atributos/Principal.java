public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(29);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Ana");
        pessoa3.setIdade(28);

        System.out.println("O nome da Pessoa 1 é " + pessoa1.getNome() + " e a idade é " + pessoa1.getIdade());
        System.out.println("O nome da Pessoa 2 é " + pessoa2.getNome() + " e a idade é " + pessoa2.getIdade());
        System.out.println("O NOME DA Pessoa 3 é " + pessoa3.getNome() + " e a idade é " + pessoa3.getIdade());
    }
}
