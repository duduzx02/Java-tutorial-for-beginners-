package PalavraChaveStatic;

import org.w3c.dom.ls.LSOutput;

public class Exemplo {
    static int contator = 0;

    public Exemplo(){
        contator++;
    }

    public static void main(String[] args) {
        System.out.println(Exemplo.contator);

        Exemplo obj1 = new Exemplo();
        Exemplo obj2 = new Exemplo();

        System.out.println(Exemplo.contator);

    }

}



