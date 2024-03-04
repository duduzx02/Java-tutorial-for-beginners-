package CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        try{
            checkAge(age);
            System.out.println("Cadastro concluído com sucesso!");
        } catch (AgeException e){
            System.out.println("Erro: " + e.getMessage());
        }

        }

    public static void checkAge(int age) throws AgeException{
        if(age < 18) {
            throw new AgeException("Você precisa ter 18 anos ou mais para se cadastrar");
        }
    }


}
