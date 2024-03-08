package ClassesInternasAnonimas;

public class Greeting {
    public void welcome(){
        System.out.println("Hello, World!!");
    }

    public static void main(String[] args) {
        var greeting = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("Yo, bro!");
            }
        };

        greeting.welcome();
    }
}
