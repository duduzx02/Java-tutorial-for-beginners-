import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        // Gerando um número inteiro aleatório
        System.out.println("Gerando um número aleatório entre 1 e 6: " + random.nextInt((6) + 1));
        // gerando um número Double aleatório
        System.out.println("Gerando um número aleatório do tipo double: " + random.nextDouble());
        // Gerando um valor Booleano aleatório
        System.out.println("gerando um valor booleano: " + random.nextBoolean());
    }
}

// - Considerações Finais
// - - Esses números não são verdadeiramente aleatórios, mas são chamados de números pseudirrandômicos.