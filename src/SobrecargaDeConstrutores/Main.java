package SobrecargaDeConstrutores;

public class Main {
    public static void main(String[] args) {
        Pizza pizzaCompleta = new Pizza("This crust");
        var pizzaapenasQueijo = new Pizza("This crust", "Tomato");
        var pizzaVegana = new Pizza("This crust", "tomato", "no cheese");
        var pizzaApenasMassa = new Pizza("Thick crust", "no sauce", "no cheese");

        System.out.println(pizzaApenasMassa);
        System.out.println(pizzaVegana);
        System.out.println(pizzaapenasQueijo);
        System.out.println(pizzaCompleta);

    }
}
