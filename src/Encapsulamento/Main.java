package Encapsulamento;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var carro = new Carro("Ferrari", "813 GTS", 2024);

        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());

        carro.setAno(2023);
        System.out.println(carro.getAno());

    }
}
