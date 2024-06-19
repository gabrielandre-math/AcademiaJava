# Exercícios realizados da apostila

| Fácil | Intermediário | Avançado  |
|----------|----------|----------|
| [Exercício 1 - Classes e Atributos](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%201%20-%20Classes%20e%20Atributos) | [Exercício 7 - Herança](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%207%20-%20Herança) | [Exercício 13 - Polimorfismo](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%2013%20-%20Polimorfismo%20(Sobrecarga%20de%20Métodos)) |
| [Exercício 2 - Classes e Atributos](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%202%20-%20Classes%20e%20Atributos) | [Exercício 8 - Herança](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%208%20-%20Herança) | [Exercício 14 - Polimorfismo](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%2014%20-%20Polimorfismo) |
| [Exercício 3 - Classes, Atributos e Métodos](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%203%20-%20Classes%2C%20Atributos%20e%20Métodos) | [Exercício 9 - Herança](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%209%20-%20Herança) | [Exercício 15 - Exceções](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Exercício%2015%20-%20Exceções) |
| [Exercício 4 - Classes, Atributos e Métodos](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%204%20-%20Classes%2C%20Atributos%20e%20Métodos) | [Exercício 10 - Herança](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%2010%20-%20Herança) |
| [Exercício 5 - Construtores](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%205%20-%20Construtores) | [Exercício 11 - Classe Abstrata](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%2011%20-%20Classe%20Abstrata) |
| [Exercício 6 - Construtores](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%206%20-%20Construtores) | [Exercício 12 - Interfaces](https://github.com/gabrielandre-math/AcademiaJava/tree/main/Exercicios%20BackEnd/Apostilas/Apostila%20Orientação%20a%20Objetos/Todos%20os%20Exercícios/Exercício%2012%20-%20Interfaces) 




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
Os atributos podem ter diferentes **modificadores de acesso** (_public_, _private_, _protected_, _default_) que determinam onde eles podem ser acessados. 

É uma prática comum fazer os atributos _private_ para encapsular os dados e fornecer métodos _public_ _get_ e _set_ para acessar e modificar esses atributos. Isso é conhecido como **encapsulamento**.
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
No exemplo acima, o atributo _cor_ é _private_, então ele só pode ser acessado dentro da classe _Carro_. No entanto, temos métodos _public_, _getCor_ e _setCor_ que permitem que outros código obtenham e definam o valor de _cor_, respectivamente. 

Isso permite que controlemos como _cor_ é acessado e modificado, o que pode ajudar a prevenir erros e manter a integridades dos dados.

## O que é um Construtor?
Em Java, um **construtor** é um bloco de código especial que é usado para inicializar um objeto. Ele é chamado quando um objeto da classe é criado usando a palavra-chave _new_.

Um construtor em Java tem o mesmo nome que a classe e não tem um tipo de retorno (nem mesmo _void_). Ele pode ter zero, um ou mais parâmetros.
Exemplo de construtor em Java:
~~~java
public class Carro {
    String cor;
    String marca;

    // Construtor
    public Carro(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "Ferrari"); // Cria um novo objeto Carro usando o construtor
    }
}
~~~
Neste exemplo _Carro_ é o construtor da classe **Carro**. Ele recebe dois parâmetros (_cor_ e _marca_) e usa esses parâmetros para inicializar o estado do objeto _Carro_.
Se você não fornecer um construtor para sua classe, o compilador Java criará um **construtor padrão** para você. O construtor padrão não tem parâmetros e não faz nada.

É possível também ter **vários construtores** em uma classe, desde que eles tenham listas de parâmetros diferentes. 

Isso é conhecido como **sobrecarga de construtores**. Por exemplo, você pode ter um construtor que não recebe parâmetros e outro que recebe dois parâmetros, como neste exemplo:
~~~java
public class Carro {
    String cor;
    String marca;

    // Construtor sem parâmetros
    public Carro() {
        this.cor = "Branco";
        this.marca = "Toyota";
    }

    // Construtor com parâmetros
    public Carro(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }
}
~~~
Neste exemplo, se você criar um _Carro_ sem fornecer parâmetros (_new Carros()_), o construtor sem parâmetros será chamado e o carro será inicializado como um Toyota branco. Se você fornecer parâmetros (_new Carro("Vermelho", "Ferrari")_), o construtor com parâmetros será chamado e o carro será inicializado de acordo com os parâmetros fornecidos.

## É possível copiar Objetos?
Sim, é possível copiar objetos em Java usando um construtor. Isso é conhecido como um **construtor cópia**. Um construtor de cópia é um construtor que recebe um objeto da mesma classe como parâmetro e copia seus valores para o novo objeto.

Exemplo de como um construtor de cópia pode ser usado em Java:
~~~java
public class Carro {
    String cor;
    String marca;

    // Construtor
    public Carro(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
    }

    // Construtor de cópia
    public Carro(Carro carroOriginal) {
        this.cor = carroOriginal.cor;
        this.marca = carroOriginal.marca;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carroOriginal = new Carro("Vermelho", "Ferrari"); // Cria um novo objeto Carro
        Carro carroCopia = new Carro(carroOriginal); // Cria uma cópia do objeto Carro

        System.out.println(carroOriginal.cor); // Imprime "Vermelho"
        System.out.println(carroCopia.cor); // Imprime "Vermelho"
    }
}
~~~
Neste exemplo, _Carro(Carro carroOriginal)_ é um cosntrutor de cópia. Ele recebe um objeto _Carro_ como parâmetro e copia os valores de _cor_ e _marca_ do objeto original para o novo objeto.
Note que este é um exemplo simples e que a cópia de objetos pode se tornar mais complexa se os objetos tiverem atributos que são referências a outros objetos. 

Nesses casos, será necessário fazer uma **cópia profunda**, na qual também serão criadas cópias dos objetos referenciados, em vez de apenas copias as referências. Isso depende das necessidades específicas do código que está recebendo este tipo de técnica.

### Exemplo de Cópia Profunda com Construtores
Vamos considerar uma classe **Carro**, que é um objeto de outra classe **Motor**.
~~~java
public class Motor {
    String tipo;

    // Construtor
    public Motor(String tipo) {
        this.tipo = tipo;
    }

    // Método para criar uma cópia profunda do Motor
    public Motor copiaProfunda() {
        return new Motor(this.tipo);
    }
}

public class Carro {
    String cor;
    Motor Motor;

    // Construtor
    public Carro(String cor, Motor Motor) {
        this.cor = cor;
        this.motor = motor;
    }

    // Construtor de cópia (cópia profunda)
    public Carro(Carro carroOriginal) {
        this.cor = carroOriginal.cor;
        this.motor = carroOriginal.motor.copiaProfunda(); // Cria uma cópia profunda do motor
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motorOriginal = new Motor("V8");
        Carro carroOriginal = new Carro("Vermelho", motorOriginal); // Cria um novo objeto Carro

        Carro carroCopia = new Carro(carroOriginal); // Cria uma cópia profunda do objeto Carro

        System.out.println(carroOriginal.cor); // Imprime "Vermelho"
        System.out.println(carroCopia.cor); // Imprime "Vermelho"

        System.out.println(carroOriginal.motor.tipo); // Imprime "V8"
        System.out.println(carroCopia.motor.tipo); // Imprime "V8"
    }
}
~~~
Neste exemplo, a classe **Motor** tem um método _copiaProfunda()_ que criar uma nova instância de **Motor** com o mesmo _tipo_. O construtor de cópia da classe **Carro** chama este método para criar uma cópia profunda do _motor_. Assim, _carroOriginal_ e _carroCopia_ têm _motor_ diferente, mas com o mesmo _tipo_. 

Isso é uma cópia profunda. Se você alterar o _tipo_ do _motor_ em _carroOriginal_, isso não afetará o _motor_ em _carroCopia_, e vice-versa. Isso é diferente de uma cópia superficial, onde ambos os carros compartilhariam a mesma instância de **Motor**.

## O que é uma Classe Abstrata?
Em Java, uma **classe abstrata** é uma superclasse que não pode criar objetos por conta própria e é projetada para ser herdada por subclasses que implementam ou complementam os métodos abstratos.
Pontos-chave sobre classes abstratas:
- **Métodos Abstratos**: Uma classe abstrata pode ter métodos abstratos, que são declarados sem uma implementação (sem corpo). Subclasses concretas são obrigadas a implementar esses métodos.
- **Métodos concretos**: Também podem conter métodos concretos (com implementação). Isso permite reutilizar o código comum às subclasses.
- **Construtores**: Embora não possam ser instanciadas, classes abstratas podem ter construtores que são chamados quando uma instância de uma subclasse concreta é criada.
- **Variáveis de Membro**: Podem ter variáveis de membro que podem ser herdados pelas subclasses.

  
Exemplo:
~~~java
abstract class Animal {
    protected int idade;

    public Animal(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();

    public void dormir() {
        System.out.println("Zzz");
    }
}

class Cachorro extends Animal {

    public Cachorro(int idade) {
        super(idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
~~~
Neste exemplo, **Animal** é uma classe abstrata com um método abstrato _emitirSom()_ é um método concreto _dormir()_. A classe **Cachorro** é uma subclasse concreta que implementa o método abstrato _emitirSom()_.
### Quando são úteis?
Classes abstratas são úteis quando você tem uma base comum de características e comportamentos para um grupo de classes relacionadas, mas nunca espera criar objetos da classe base diretamente. Elas são uma forma de forçar um contrato para as subclasses, garantindo que certos métodos sejam implementados.

## O que são Interfaces?
Em Java, uma **interface** é um tipo de referência similar a uma classe, que pode conter apenas constantes, métodos de assinatura, métodos default, métodos estáticos e métodos privados. Ela é usada para definir um contrato que as classes que a implementam devem seguir.
Pontos-chave sobre interfaces:
- **Métodos Abstratos**: Todos os métodos em uma interface são implicitamente abstratos, exceto os métodos default e estáticos.
- **Implementação Múltipla**: Uma classe em Java pode implementar múltiplas interfaces, permitindo a herança múltipla de tipo.
- **Public e Abstract**: Todos os métodos de uma interface são implicitamente públicos e abstratos (exceto os métodos default e estáticos).
- **Constantes**: Todos os campos em interfaces são public, static e final por padrão, ou seja, são constantes.
Um exemplo de interface seria:
~~~java
public interface Animal {
    int IDADE_MAXIMA = 100; // constante

    void emitirSom(); // método abstrato

    default void respirar() {
        System.out.println("Respirando normalmente");
    }
}

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
~~~
Neste exemplo, **Animal** é uma interface com um campo constante _IDADE_MAXIMA_, um método abstrato _emitirSom()_ e um método default _respirar()_. A classe **Cachorro** implementa a interface **Animal** e fornece a implementação do método abstrato _emitirSom()_.

### Quando são úteis?
Interfaces são úteis quando você quer garantir que diferentes classes sigam um mesmo padrão ou contrato de comportamento, sem se preocupar com a estrutura interna ou estado dessas classes. Elas são especialmente úteis em situações onde várias classes podem compartilhar o mesmo comportamento, mas não necessariamente têm uma relação de pai-filho.

## Exceções em Java
Em Java, uma **Exceção** é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal das instruções. É um objeto que é lançado (ou "thrown") em um ponto do código onde ocorreu um problema e capturado (ou  "caught") em outro ponto para ser tratado.

Pontos-chave sobre exceções:
- **Hierarquia de Exceções**: Em Java, todas as exceções são subclasses de **Throwable**. A classe **Exception** é uma subclasse de **Throwable** que é usada para condições excepcionais que um programa deve capturar.
- **Checked e Unchecked**: Exceç~eos em Java são categorizadas como checked (verificadas) ou unchecked (não verificadas). Exceções checked são aquelas que o compilador exige que sejam tratas ou declaradas no código. Exceções unchecked são aquelas que o compilador não exige que sejam tratadas ou declaradas.
- **Try-Catch**: Para capturar e tratar exceções, usamos blocos **try-catch**. O bloco **try** contém o código que pode lançar uma exceção, e o bloco **catch** contém o código para trata a exceção.
- **Finally**: O bloco **finally** é opcional e contém o código que é executado após o bloco **try-catch**, independentemente de uma exceção ter sido lançada ou não.
  
Um exemplo simples seria:
~~~java
public class TesteExcecao {
    public static void main(String[] args) {
        try {
            int divisao = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero!");
        } finally {
            System.out.println("Esta linha é sempre executada.");
        }
    }
}
~~~
Neste exemplo, tentamos dividir um número por zero, o que lança uma _ArithmeticException_. O erro é capturado no bloco **catch**, onde tratamos a exceção imprimindo uma mensagem. O bloco **finally** é executado após o tratamento da exceção, independentemente do resultado.

### Por que usar isso?
Exceções são fundamentais para o manejo de erros em Java, permitindo que os programas se recuperem de condições anormais sem falhar completamente.

Criado por _Gabriel André._
