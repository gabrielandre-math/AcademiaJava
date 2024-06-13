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
