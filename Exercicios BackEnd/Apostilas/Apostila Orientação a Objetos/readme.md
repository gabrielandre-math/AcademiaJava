# Exercícios
- [Exercício 1]()
- [Exercício 2]()
- [Exercício 3]()
- [Exercício 4]()
- [Exercício 5]()

# Resumo teórico de Orientação a Objetos

## O que é uma classe?
Classe é uma abstração do mundo real.

## O que é um objeto?
Em Java, um objeto é uma instância de uma classe. Pode ser criado usando a palavra _new_ seguida pelo nome da classe e parênteses. 
Cada objeto possui seu próprio estado e comportamento.

O **estado** de um objeto é representado por atributos ou variáveis de instância. 
> Por exemplo, um objeto do tipo _Carros_ pode ter atributos como _cor_, _marca_ e _modelo_.

O **comportamento** de um objeto é representado por métodos.
> Por exemplo, um objeto _Carro_ pode ter métodos como _acelerar()_, _frear()_ e _virar()_.

Veja o exemplo abaixo:
~~~java
public class Carro {
    String cor;
    String marca;

    void acelerar() {
        // código para acelerar
    }

    void frear() {
        // código para frear
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Cria um novo objeto Carro
        meuCarro.cor = "Vermelho"; // Define o estado do objeto
        meuCarro.marca = "Ferrari";
        meuCarro.acelerar(); // Chama um método do objeto
    }
}

~~~
No exemplo acima, _meuCarro_ é um objeto da classe _Carro_. Ele tem um estado (_cor_ e _marca_) e comportamento (_acelerar()_ e _frear()_). 

## O que é Herança?
A **Herança** é um dos quatro pilares fundamentais da Programação Orientada a Objetos (POO) em Java. Ela permite que uma classe herde campos e métodos de outra classe.
Pontos-chave sobre a herança em Java:
- **Superclasse e Subclasse**: Na herança, a classe da qual os métodos e campos são herdados é chamada de **superclasse** ou **classe pai**, e a classe que herda esses métodos e campos é chamada de **subclasse** ou **classe filha**.
- **Palavra-chave 'extends'**: Em Java, a herança é implementada usando a palavra-chave _extends_.
> Por exemplo, se temos uma classe _Animal_ e queremos criar uma nova classe _Cachorro_ que herda de _Animal_, faríamos assim:
~~~java
public class Animal {
    void comer() {
        // código para comer
    }
}

public class Cachorro extends Animal {
    void latir() {
        // código para latir
    }
}
~~~
Neste exemplo, _Cachorro_ é uma subclasse de _Animal_ e herda o método _comer()_ da superclasse _Animal_.
- **Reutilização de Código**: A herança é uma maneira eficaz de reutilizar o código. Se várias classes compartilham funcionalidades comuns, essas funcionalidades podem ser implementadas na superclasse e as subclasses podem herdar essas funcionalidades.
- **Sobrescrita de Métodos**: Uma subclasse pode sobrescrever os métodos herdados da superclasse para fornecer uma implementação específica. Isso é chamado de **sobrescrita de métodos**.
> Observação: Java não suporta herança múltipla, o que significa que uma classe não pode estender mais de uma classe. No entanto, uma classe pode implementar múltiplas interfaces, que é uma maneira de contornar essa limitação da linguagem.

## O que é polimorfismo?
**Polimorfismo** é outro dos quatro pilares fundamentais da Programação Orientada a Objetos (POO) em Java. 
Em Java, o polimorfismo permite que um objeto seja tratado como uma instância de uma superclasse, enquanto na verdade é uma instância de uma subclasse. Isso permite que o mesmo código funcione com diferentes tipos de objetos, desde que esses objetos sejam subclasses da mesma superclasse.
Existem dois tipos principais de polimorfismo em Java:
1. **Polimorfismo de tempo de compilação** (também conhecido como **sobrecarga de métodos**): Isso ocorre quando duas ou mais funções na mesma classe têm o mesmo nome, mas diferentes parâmetros.
2. **Polimorfismo de tempo de execução** (também conhecido como **sobrescrita de métodos**): Isso ocorre quando uma subclasse tem um método que já existe na sua superclasse. A subclasse pode fornecer sua própria implementação desse método.
Veja este exemplo de polimorfismo em Java:
~~~java
public class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

public class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro(); // Polimorfismo: um Cachorro é um Animal
        meuAnimal.fazerSom(); // Chama o método fazerSom() da classe Cachorro
    }
}
~~~
Neste exemplo, _meuAnimal_ é tratado como um _Animal_, mas na verdade é um _Cachorro_. Quando chamamos _meuAnimal.fazerSom()_, o método _fazerSom()_ da classe _Cachorro_ é chamado, não o da classe _Animal_. Isso é polimorfismo em ação! :D

## Como Proteger Classes?
Em Java, podemos proteger classes e seus membros (métodos e variáveis) usando **modificadores de acesso**. Os modificadores de acesso determinam onde uma classe ou membro de classe pode ser acessado. Existem quatro tipos de modificadores de acesso em Java:
1. **Private**: O membro é acessível apenas dentro da mesma classe.
2. **Default (nenhum modificador)**: O membro é acessível dentro do mesmo pacote.
3. **Protected**: O membro é acessível dentro do mesmo pacote e também para subclasses em pacote diferentes.
4. **Public**: O membro é acessível de qualquer lugar.
   
Veja um exemplo de como usar modificadores de acesso para proteger uma classe e seus membros:
~~~java
public class MinhaClasse {
    private int meuAtributoPrivado; // Apenas acessível dentro desta classe
    int meuAtributoDefault; // Acessível dentro do mesmo pacote
    protected int meuAtributoProtegido; // Acessível dentro do mesmo pacote e para subclasses em pacotes diferentes
    public int meuAtributoPublico; // Acessível de qualquer lugar

    private void meuMetodoPrivado() {
        // Apenas acessível dentro desta classe
    }

    void meuMetodoDefault() {
        // Acessível dentro do mesmo pacote
    }

    protected void meuMetodoProtegido() {
        // Acessível dentro do mesmo pacote e para subclasses em pacotes diferentes
    }

    public void meuMetodoPublico() {
        // Acessível de qualquer lugar
    }
}
~~~ 
É válido ressaltar que: as classes em si só podem ser _public_ ou _default_ (sem modificador). Uma classe não pode ser _private_ ou _protected_. No entanto, classes internas (classes definidas dentro de outras classes) podem ser _private_, _protected_, _public_ ou _default_.
Além disso, é importante lembrar que encapsular adequadamente os membros de uma classe (usando _private_ e fornecendo métodos _get_ e _set_ quando necessário) é uma prática recomendada em Java para manter a integridade dos dados e a segurança da classe. 

Isso é conhecido como **encapsulamento**.

## O que é um Método?
Em Java, um **método** é um bloco de código que realiza uma tarefa específica. Cada método em Java é associado a uma classe e é definido dentro dessa classe.

Um método em Java tem a seguinte estrutura:
~~~java
modificadorDeAcesso tipoDeRetorno nomeDoMetodo(parametros) {
    // Corpo do método
}
~~~
Aqui estão os componentes de um método:
- **Modificador de Acesso**: Este é o modificador que define onde o método pode ser acessado. Pode ser _public_, _private_, _protected_ ou _default_ (nenhum modificador).
- **Tipo de Retorno**: Este é o tipo de dado que o método retorna. Pode ser qualquer tipo de dado válido em Java, como _int_, _double_, _String_, etc. Se o método não retorna um valor, o tipo de retorno é _void_.
- **Nome do Método**: Este é o nome que você dá ao método. Deve ser um identificador válido em Java.
- **Parâmetros**: Estes são os valores de entrada que o método recebe. Os parâmetros são opcionais; um método pode não ter nenhum parâmetro.
- **Corpo do Método**: Este é o bloco de código que é executado quando o método é chamado. Ele é delimitado por chaves _{}_.
Exemplo de método em Java:
~~~java
public class MinhaClasse {
    // Método sem retorno e sem parâmetros
    public void meuMetodo() {
        System.out.println("Executando meuMetodo");
    }

    // Método com retorno e com parâmetros
    public int somar(int a, int b) {
        return a + b;
    }
}
~~~
Neste exemplo, _meuMetodo_ é um método que não tem parâmetros e não retorna um valor. Ele simplesmente imprime uma mensagem na tela. _somar_ é um método que recebe dois parâmetros (_a_ e _b_) e retorna a soma deles. Ambos os métodos são _public_, o que significa que eles podem ser acessador de qualquer lugar.
## O que é um Atributo?
Em Java, um atributo (também conhecido como **campo** ou **variável de instância**) é uma variável que é declarada dentro de uma classe, mas fora de qualquer método. Cada objeto da classe tem sua própria cópia do atributo.
Os atributos são usados para representar o **estado** de um objeto. Por exemplo, se você tem uma classe _Carro_, você pode ter atributos como _cor_, _marca_ e _modelo_ para representar o estado de um carro.
Exemplo de como os atributos são usados em Java:
~~~java
public class Carro {
    String cor; // Atributo
    String marca; // Atributo
    String modelo; // Atributo

    void acelerar() {
        // Método
    }
}
~~~
Neste exemplo, _cor_, _marca_ e _modelo_ são atributos da classe _Carro_. Cada objeto _Carro_ terá sua própria _cor_, _marca_ e _modelo_.
Os atributos podem ter diferentes **modificadores de acesso** (_public_, _private_, _protected_, _default_) que determinam onde eles podem ser acessados. É uma prática comum fazer os atributos _private_ para encapsular os dados e fornecer métodos _public_ _get_ e _set_ para acessar e modificar esses atributos. Isso é conhecido como **encapsulamento**.
Por exemplo:
~~~java
public class Carro {
    private String cor; // Atributo privado

    public String getCor() { // Método getter
        return cor;
    }

    public void setCor(String cor) { // Método setter
        this.cor = cor;
    }
}
~~~
No exemplo acima, o atributo _cor_ é _private_, então ele só pode ser acessado dentro da classe _Carro_. No entanto, temos métodos _public_, _getCor_ e _setCor_ que permitem que outros código obtenham e definam o valor de _cor_, respectivamente. Isso permite que controlemos como _cor_ é acessado e modificado, o que pode ajudar a prevenir erros e manter a integridades dos dados.


Criado por _Gabriel André._
