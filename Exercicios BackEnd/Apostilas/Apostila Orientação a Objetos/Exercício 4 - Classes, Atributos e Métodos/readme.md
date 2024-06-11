# Classes, Atributos e Métodos

## Exercício 4
**Descrição**: Crie uma classe chamada **Moto** com três atributos (marca, modelo e cilindradas) e dois métodos (atribuir valores e retornar valores).
Na classe **LocadoraVeiculos**, crie um objeto do tipo Carro e dois objetos do tipo Moto, sendo que os objetos serão criados de acordo com a solicitação desses dados ao usuário, via linha de execução, conforme exemplo abaixo.
~~~java
import java.util.Scanner;
public class LocadoraVeiculos {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Insira o Fabricante do Veículo: ");
    String fabricante = leitura.nextLine();
    .              
    .                
    .                 
}
~~~
Após a criação dos objetos, utilize o método para retornar valores e exiba na tela o conteúdo dos objetos criados.
## Solução
### UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/509e7ced-bd5a-402c-9ac7-84b4015342ed)
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/68e5ed3b-8315-471c-b737-bb6b7a245e37)

### Código
**Classe LocadoraVeiculos**
~~~java
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

~~~

**Classe Carro**
~~~java
public class Carro {
    private String fabricante;
    private String modelo;

    //Constructor
    public Carro() {}
    public Carro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Getters
    public String getFabricante() {
        return fabricante;
    }
    public String getModelo() {
        return modelo;
    }

    //Setters
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Additional methods
    public String exibirDados() {
        return "Dados do carro: " + getFabricante() + " " + getModelo();
    }
    public void atribuirValores(String fabricante, String modelo) {
        setFabricante(fabricante);
        setModelo(modelo);
    }
}

~~~

**Classe Moto**
~~~java
public class Moto {
    private String marca;
    private String modelo;
    private int cilindradas;

    //Constructors
    public Moto(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }
    public Moto() {}

    //Getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCilindradas() {
        return cilindradas;
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    //Additional methods
    public String exibirDados() {
        return "Dados da moto: " + getMarca() + " " + getModelo() + " " + getCilindradas();
    }
    public void atribuirValores(String marca, String modelo, int cilindradas) {
        setMarca(marca);
        setModelo(modelo);
        setCilindradas(cilindradas);
    }
}

~~~

Criado por _Gabriel André._
