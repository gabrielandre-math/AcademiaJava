# Polimorfismo
## Exercício 13
**Descrição**: Crie uma classe para uma das operações (+, -, /, *). Cada operação deverá herdar a classe Operação abaixo, e fazer a sobrescrita do método calcular. Uma classe **Principal** deverá solicitar ao usuário os números a serem calculados e exibir o resultado das operações. Utilizar construtores.
~~~java
public class Operacao {
  protected double a;
  protected double b;
  protected double resultado;
  public double calcular() {
    return resultado;
  }
}
~~~
## Solução
Classe **Operacao**
~~~java
public class Operacao {
    protected double a;
    protected double b;
    protected double resultado;
    public double calcular() {
        return resultado;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
~~~
Classe **Principal**
~~~java
import java.util.Scanner;

public class Principal extends Operacao {
    public static void main(String[] args) {
        Operacao operacao = new Principal();
        double resultado = operacao.calcular();
        System.out.println("O resultado é: " + resultado);
    }
    @Override
    public double calcular() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite a operação desejada: ");
        System.out.println(" (+, -, /, *)");
        String option = sc.next();

        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        switch (option) {
            case "+":
                setResultado(num1 + num2);
                break;
            case "-":
                setResultado(num1 - num2);
                break;
            case "/":
                if (num2 != 0) {
                    setResultado(num1 / num2);
                } else {
                    System.out.println("Divisão por zero não é permitida!");
                    return 0;
                }
                break;
            case "*":
                setResultado(num1 * num2);
                break;
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
        return getResultado();
    }

}
~~~
Criado por _Gabriel André._
