public class Methods {

    // Criando um método
    static void hello(){
        System.out.println("Hello!");
    }

    // Criando métodos com parâmetro
    static void greet(String name){
        System.out.println("Hello, " + name);
    }

    static int sum(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        // Chamando os métodos
        hello();
        greet("Eduardo");
        System.out.println("sum(8, 9); = " + sum(8, 9));
    }
}
