package Interfaces;

public class Main {

    public static void main(String[] args) {
        var fish = new Fish();
        var rabbit = new Rabbit();
        var hawk = new Hawk();

        fish.flee();
        fish.hunt();

        hawk.hunt();
        rabbit.flee();


    }

}
