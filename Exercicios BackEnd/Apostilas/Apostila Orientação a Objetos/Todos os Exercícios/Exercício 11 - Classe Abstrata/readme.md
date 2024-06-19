# Classe Abstrata
## Exercício 11
**Descrição**: Crie uma classe abstrata chamada **Mensagem** com os métodos abstratos _exibeMensagemA()_ e _exibeMensagemB()_ que deverão ser implementados em uma classe **Principal**. A mensagem A deverá ser sempre a seguinte:
~~~java
  "Cuide bem dos animais"
~~~
Já, a mensagem B deverá ser uma mensagem de para preservação do planeta que o usuário, em tempo de execução do sistema, irá digitar. 

Após, imprima na tela as duas mensagem.

## Solução
Classe **Principal**
~~~java
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
~~~
Classe **Mensagem**
~~~java
public abstract class Mensagem {
    public abstract void exibeMensagemA();
    public abstract void exibeMensagemB();
}
~~~


Criado por _Gabriel André._
