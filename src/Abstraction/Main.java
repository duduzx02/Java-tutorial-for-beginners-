package Abstraction;

public class Main {
    public static void main(String[] args) {

        // Veiculo veiculo = new Veiculo(); // ERROR
        Carro carro = new Carro();

        carro.go();
        carro.stop();
    }
}
