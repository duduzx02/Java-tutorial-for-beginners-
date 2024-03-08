package Lambda;

public class Main {
    public static void main(String[] args) {
        // Usando expressões lambda para definir operações aritméticas
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Adição: " + operate(5, 3, addition));
        System.out.println("Subtração: " + operate(5, 3, subtraction));
        System.out.println("Multiplicação: " + operate(5, 3, multiplication));

    }

    public static int operate(int a, int b, MathOperation operation){
        return operation.operate(a, b);
    }
}
