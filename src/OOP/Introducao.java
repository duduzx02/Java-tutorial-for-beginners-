package OOP;

public class Introducao {
    public static void main(String[] args) {

        Carro meuCarro1 = new Carro();

        meuCarro1.marca = "Checvrolet";
        meuCarro1.modelo = "Corvette";
        meuCarro1.ano = 2020;
        meuCarro1.cor = "Azul";
        meuCarro1.preco = 50000.00;

        System.out.println(meuCarro1.ano);

        Carro meuCarro2 = new Carro();
        meuCarro2.marca = "Ford";
        meuCarro2.modelo = "Mustang";
        meuCarro2.ano = 2022;
        meuCarro2.cor = "Vermelho";
        meuCarro2.preco = 60000.00;


        // Utilizando os objetos Carro
        System.out.println("Carro 1: " + meuCarro1.marca + " " + meuCarro1.modelo);
                meuCarro1.dirigir();

        System.out.println("Carro 2: " + meuCarro2.marca + " " + meuCarro2.modelo);
                meuCarro2.dirigir();

    }
}
