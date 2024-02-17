package Super;

public class Main {
    public static void main(String[] args) {
        Hero super1 = new Hero("Batman", 42, "Dinheiro");
        Hero super2 = new Hero("Superman", 43, "Tudo");

        System.out.println(super1.toString());
        System.out.println(super2.toString());
    }
}
