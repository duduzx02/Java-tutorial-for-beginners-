import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aceitando Entrada de Texto

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual é sua comida favorita?");
        String food = scanner.nextLine();

        // Aceitando Entrade numérica

        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Olá " + nome);
        System.out.println("Sua idade: " + age);
        System.out.println("Você gosta de:" + food);


    }
}
