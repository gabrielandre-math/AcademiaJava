# Classes, Atributos e Métodos

## Exercício 3
**Descrição**: Crie um método para atribuir valores para _fabricante_ e _modelo_ do carro, sendo que esses valores são recebidos pelo método através de parâmetros. Após, implemente a classe **LocadoraVeiculos** para instanciar a classe Carro, chamar o método correspondente e passar os parâmetros necessários. Além de um método para atribuir os valores, crie um método que retorna os valores atribuídos. 


O resultado da execução da classe LocadoraVeiculos deve ser:
~~~
  Dados do carro: VW Gol
~~~

## Solução

### UML Desenvolvido
![image](https://github.com/gabrielandre-math/AcademiaJavaAtos/assets/60861872/509e7ced-bd5a-402c-9ac7-84b4015342ed)


### Código
**Classe LocadoraVeiculos**
~~~java
public class LocadoraVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.atribuirValores("VW", "Gol");
        System.out.println(carro.exibirDados());
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



Criado por _Gabriel André._
