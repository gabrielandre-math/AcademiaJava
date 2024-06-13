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
