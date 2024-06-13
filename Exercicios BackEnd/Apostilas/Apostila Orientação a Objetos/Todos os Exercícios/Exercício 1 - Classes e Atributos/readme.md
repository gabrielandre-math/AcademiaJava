# Classes e Atributos

## Exercício 1
**Descrição**: Criar três objetos do tipo _Pessoa_, e exibir apenas a idade dessas pessoas:

## Solução
### UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/2809c13a-94a8-4636-9c7a-b565b8cb512a)
### Código
**Classe Principal**
~~~java
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

~~~
**Classe Pessoa**
~~~java
public class Pessoa {
    private String nome;
    private int idade;

    //Constructor
    public Pessoa() {}
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
~~~

Criado por _Gabriel André._
