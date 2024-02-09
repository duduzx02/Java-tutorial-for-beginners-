public class Printf {
    public static void main(String[] args) {
        int myInt = 2;
        float myFloat = 2;
        String myString = "Minha String";
        char myChar = '@';
        boolean myBoolean = true;
        double myDouble = 26.0;


        System.out.printf("%d%n", myInt);
        System.out.printf("%f%n", myFloat);
        System.out.printf("%s%n", myString);
        System.out.printf("%c%n", myChar);
        System.out.printf("%b%n", myBoolean);
        System.out.printf("%f%n", myDouble);

        // precisão
        // Quntas caracteris eu desejo mostrar
        System.out.printf("Hello %.2s %n", myString);

        // Quantas casas decimais eu quero msotrar
        System.out.printf("Precisão com as casas decimais %,.2f", myDouble);

    }
}
