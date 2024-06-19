# Interfaces
## Exercício 12
**Descrição**: Crie uma classe **Compromisso** que possui os atributos nome (do compromisso), data e hora. A classe **Compromisso** é herdada pelas classes **Profissional** e **Pessoal** que possuem uma interface  de acesso.

Além disso, a classe **Profissional** possui o método _exibeCompromissoProfissional()_ e a classe **Pessoal** possui o método _exibeCompromissoPessoal()_.

Ambos os métodos deverão ser implementados em uma classe **Principal**, que também fará a leitura dos valores dos atributos e as suas respectivas impressões na tela.


## Solução
Interface **InterfaceEnunciado**
~~~java
public interface InterfaceEnunciado {
    public void exibeCompromissoProfissional();
}
~~~
Interface **InterfaceEnunciadoDois**
~~~java
public interface InterfaceEnunciadoDois {
    public void exibeCompromissoPessoal();
}
~~~
Classe Abstrata **Compromisso**
~~~java
public abstract class Compromisso {
    private String nome;
    private String data;
    private String hora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
~~~
Classe **Pessoal**
~~~java
public class Pessoal extends Compromisso implements InterfaceEnunciadoDois {
    @Override
    public void exibeCompromissoPessoal() {
        System.out.println("Compromisso: ");
        System.out.println(getNome());
        System.out.println(getData());
        System.out.println(getHora());
    }
}
~~~
Classe **Profissional**
~~~java
public class Profissional extends Compromisso implements InterfaceEnunciado {
    @Override
    public void exibeCompromissoProfissional() {
            System.out.println("Compromisso: ");
            System.out.println(getNome());
            System.out.println(getData());
            System.out.println(getHora());
    }
}
~~~
Classe **Principal**
~~~java
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
~~~


Criado por _Gabriel André._
