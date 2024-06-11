import java.util.Scanner;

public class LocadoraVeiculos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Insira o fabricante do veiculo: ");
        String fabricante = leitura.nextLine();
        System.out.println("Insira o modelo do veiculo: ");
        String modelo = leitura.nextLine();
        carro.atribuirValores(fabricante, modelo);

        Moto moto = new Moto();
        System.out.println("Insira a marca do veículo: ");
        String marca = leitura.nextLine();
        System.out.println("Insira o modelo do veiculo: ");
        String modelo2 = leitura.nextLine();
        System.out.println("Insira a cilindrada do veículo: ");
        int cilindrada = leitura.nextInt();
        moto.atribuirValores(marca, modelo2, cilindrada);

        //Output
        System.out.println(carro.exibirDados());
        System.out.println(moto.exibirDados());
    }
}
