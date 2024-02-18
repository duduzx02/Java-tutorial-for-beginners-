package Abstraction;

public class Carro extends Veiculo{

    @Override
    void go() {
        System.out.println("O motorista está dirigindo o carro.");
    }

    @Override
    void stop() {
        System.out.println("O motorista está parando carro.");
    }


}
