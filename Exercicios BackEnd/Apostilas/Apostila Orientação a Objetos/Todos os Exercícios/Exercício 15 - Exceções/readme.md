# Exceções
## Exercício 15
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
Baseado no exercício resolvido anteriormente, crie uma exceção que seja disparada, caso ambos os operandos sejam 0 (zero). A exceção deverá lançar uma mensagem:
~~~java
"Ambos os valores a serem calculados devem ser diferentes de 0"
~~~
Faça o tratamento dessa exceção, pedindo para que o usuário insira novamente os dados para cálculo.

## Solução
Classe **Principal**
~~~java
import java.util.Scanner;

public class Principal extends Operacao {

    public static void main(String[] args) {
        Principal programa = new Principal();
        programa.calcular();
    }

    @Override
    public double calcular() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.println("Digite a operação desejada: ");
            System.out.println(" (+, -, /, *)");
            String option = sc.next();

            System.out.println("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0.0;

            switch (option) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        throw new IllegalArgumentException("Divisão por zero não é permitida!");
                    }
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                default:
                    throw new IllegalArgumentException("Operação inválida!");
            }

            System.out.println("O resultado é: " + resultado);

            return resultado;

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            sc.close();
        }

        return 0;
    }
}
~~~
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

Criado por _Gabriel André._
