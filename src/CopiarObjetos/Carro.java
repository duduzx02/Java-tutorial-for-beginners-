package CopiarObjetos;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Getter e setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método para copiar atributos de outro objeto Carro
    public void copiar(Carro outroCarro){
        this.marca = outroCarro.getMarca();
        this.modelo = outroCarro.getModelo();
        this.ano = outroCarro.getAno();
    }

    public Carro(Carro outroCarro){
        copiar(outroCarro);
    }
}
