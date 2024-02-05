import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Operador Lógico and
        System.out.println("Qual é a temperatura? ");
        int temperatura = scanner.nextInt();

        if(temperatura > 30){
            System.out.println("Está quente!!");
        } else if (temperatura >= 20 && temperatura <= 30){
            System.out.println("Está morno!!");
        } else {
            System.out.println("Está frio!!");
        }

        // operador lógico or
        System.out.println("Você está jogando um jogo. Pressione 'q' para sair!");
        String resposta = scanner.next();
        if (!resposta.equals("q") || !resposta.equals("Q")){
            System.out.println("Você ainda está jogando!!");
        } else{
            System.out.println("Você saiu do jogo!");
        }

    }
}
