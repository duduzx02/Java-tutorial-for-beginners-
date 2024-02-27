package PolomorfismoDinamico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre 'dog' e 'cat' ");
        String choice = scanner.next();

        Animal animal;

        if (choice.equalsIgnoreCase("dog")){
            animal = new Dog();
        } else if (choice.equalsIgnoreCase("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Escolha inválida!");
            return;
        }

        animal.speak();
    }
}
