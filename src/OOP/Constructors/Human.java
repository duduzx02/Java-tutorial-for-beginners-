package OOP.Constructors;

public class Human {
    // Atributos
    private String nome;
    private int idade;
    private double peso;

    // contrutor com parâmetros
    public Human(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void come(){
        System.out.println(this.nome + " Está comendo!");
    }

    public void drink(){
        System.out.println(this.nome + " Está bebendo *burp*");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
