package PalavraChaveStatic;

public class Friend {
    String name;
    static int numerosDeamigos;

    Friend(String name){
        this.name = name;
        numerosDeamigos++;
    }

    static void diplay(){
        System.out.println("Você tem " + numerosDeamigos + " amigos!!");
    }

}
