package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcevaoDivisaoPorZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.println("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero.");
        } catch (InputMismatchException e){
            System.out.println("Por favor, insira um número inteiro");
        } finally {
            System.out.println("Operação concluída. ");
        }

    }
}
