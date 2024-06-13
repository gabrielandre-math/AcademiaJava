# Classes e Atributos

## Exercício 2
**Descrição**: Crie uma classe chamada **Professor** que contenha um atributo público chamado nome, do tipo String. Crie também uma classe chamada **Laboratório**, que contenha um atributo público, chamado local, do tipo String.
Além disso, crie uma classe executável chamada **Disciplina**, responsável por instanciar as classes Professor e Laboratório, definindo valor aos atributos e exibindo na tela o resultado da criação desses objetos.

Por exemplo: o resultado da execução da classe Disciplina deve ser algo similar com:
~~~
  O nome do professor é: Lucas Schlestein
  O local da aula é: Sala 2
~~~

## Solução

### UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/7e3e6e6e-a2ce-476f-abed-ea3e911f79d0)
### Código
**Classe Disciplina**
~~~java
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
~~~
**Classe Professor**
~~~java
public class Professor {
    public String nome;
    //Constructor
    public Professor() {}
}
~~~
**Classe Laboratorio**
~~~java
public class Laboratorio {
    public String local;
    //Constructor
    public Laboratorio() {}
}
~~~


Criado por _Gabriel André._
