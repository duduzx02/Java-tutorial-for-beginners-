package Interfaces;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("O peixe está fugindo de um peixei maiores!");
    }

    @Override
    public void flee() {
        System.out.println("O peixe está caçando peixes menores!");
    }
}
