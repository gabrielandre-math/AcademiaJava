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
