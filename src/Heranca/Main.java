package Heranca;

public class Main {

    public static void main(String[] args) {

        var carro = new Carro();
        var bicileta = new Bicicleta();
        var veiculo = new Veiculo();

        System.out.println(carro.portas);
        System.out.println(carro.velocidade);
        carro.go();
        carro.stop();

        System.out.println("--------------");

        System.out.println(bicileta.pedais);
        System.out.println(bicileta.velocidade);
        bicileta.go();
        bicileta.stop();

        System.out.println("--------------");
        System.out.println(veiculo.velocidade);
        veiculo.go();
        veiculo.stop();


    }


}
