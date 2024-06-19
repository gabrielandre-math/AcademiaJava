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
