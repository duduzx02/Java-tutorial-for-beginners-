import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
        }

        System.out.println("Bem-vindo " + name + "." );

        int idade = 0;

        do {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
        } while (idade == 0);

        System.out.println("Sua idade: " + idade);

    }

}
