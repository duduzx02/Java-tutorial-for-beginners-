import java.util.Scanner;

public class ClassMath {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        // Métodos de Comparação: max e min
        System.out.println("O maior valor entre x e y é: Math.max(x, y) " + (Math.max(x, y)));
        System.out.println("O menor valor entre x e y é: Math.min(x, y) " + (Math.min(x, y)));

        // Função Absoluta: abs
        System.out.println("O valor absoluto de y: " + (Math.abs(y)));

        // Função Raiz Quadrada: sqrt
        // Lembrando que a raiz quadrada de números negativos não são suportados!!

        System.out.println("A raiz quadrada de x é: " + Math.sqrt(x));
        // Arredondamento:
        System.out.println("round: arredonda para o inteiro mais próximo: " + Math.round(x));
        System.out.println("ceil: sempre arredonda para cima: " + Math.ceil(x));
        System.out.println("floor: sempre arredonda para baixo: " + Math.floor(x));

        // Programa ara Calcular a Hipotenusa

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado a:");
        double a = scanner.nextDouble();

        System.out.println("Digite o lado b:");
        double b = scanner.nextDouble();

        System.out.println("A hipotenusa é: " + Math.sqrt((a * a) + (b * b)));

        scanner.close();
    }
}
