package CopiarObjetos;

public class Main {
    public static void main(String[] args) {
        var car1 = new Carro("Chevrolet", "Camaro", 2021);
        // var car2 = new Carro("Ford", "Mustang", 2022);
        var car2 = new Carro(car1);



        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMarca());
        System.out.println(car1.getModelo());
        System.out.println(car1.getAno());
        System.out.println();
        System.out.println(car2.getMarca());
        System.out.println(car2.getModelo());
        System.out.println(car2.getAno());
        System.out.println();

        car1.copiar(car2);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMarca());
        System.out.println(car1.getModelo());
        System.out.println(car1.getAno());
        System.out.println();
        System.out.println(car2.getMarca());
        System.out.println(car2.getModelo());
        System.out.println(car2.getAno());
        System.out.println();


    }
}
