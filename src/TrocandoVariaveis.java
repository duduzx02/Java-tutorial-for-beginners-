public class TrocandoVariaveis {

    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-aid";

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        // Tentativa de troca direta

       // x = y; // ou y = x;

        // Solução: utilizando uma Variável temporaria:

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

    }
}
