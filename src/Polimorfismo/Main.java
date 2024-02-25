package Polimorfismo;

public class Main {
    public static void main(String[] args) {
     /*   Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro();
        veiculos[1] = new Bicicleta();
        veiculos[2] = new Moto();

        for (Veiculo veiculo : veiculos){
            veiculo.go();
        }
*/


        var carro =  new Carro();
        var bicicleta = new Bicicleta();
        var moto = new Moto();

        Veiculo[] veiculos = {carro, bicicleta, moto};

        for (Veiculo veiculo: veiculos
             ) {
            veiculo.go();
        }

    }



}
