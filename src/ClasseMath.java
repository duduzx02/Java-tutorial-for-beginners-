public class ClasseMath {
    public static void main(String[] args) {
        double aNegativo = -2.0;
        double a = 2.0;
        double bNegativo = -3.0;
        double b = 3.0;
        double aPartido = 2.65;

        System.out.println("Math.abs(double a): Retorna o valor absoluto de um número.");
        System.out.println(Math.abs(aNegativo));

        System.out.println("Math.sqrt(double a): Retorna a raiz quadrada de um número.");
        System.out.println(Math.sqrt(b));

        System.out.println("Math.pow(double base, double exponent): Retorna a base elevada à potência do expoente.");
        System.out.println(Math.pow(a, b));

        System.out.println("Math.max(double a, double b): Retorna o maior valor entre dois números.");
        System.out.println(Math.max(a, b));

        System.out.println("Math.min(double a, double b): Retorna o menor valor entre dois números.");
        System.out.println(Math.min(bNegativo, aNegativo));

        System.out.println("Math.round(double a): Retorna o valor arredondado para o número inteiro mais próximo.");
        System.out.println(Math.round(aPartido));

        System.out.println("Math.ceil(double a): Retorna o menor número inteiro maior ou igual ao argumento.");
        System.out.println(Math.ceil(aPartido));

        System.out.println("Math.floor(double a): Retorna o maior número inteiro menor ou igual ao argumento.");
        System.out.println(Math.floor(aPartido));
    }
}
