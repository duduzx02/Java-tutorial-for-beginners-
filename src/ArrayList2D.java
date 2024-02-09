import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> padaria = new ArrayList<>();

        ArrayList<String> listaDeprodutos = new ArrayList<>();

        System.out.println("listaDeprodutos.add(\"Pão\");");
        listaDeprodutos.add("Pão");
        System.out.println("listaDeprodutos.add(\"Bolo\");");
        listaDeprodutos.add("Bolo");
        System.out.println("listaDeprodutos.add(\"Croissants\");");
        listaDeprodutos.add("Croissants");

        System.out.println("listaDeprodutos = " + listaDeprodutos);

        ArrayList<String> listaDeBebidas = new ArrayList<>();

        System.out.println("listaDeBebidas.add(\"Regrigerante\");");
        listaDeBebidas.add("Regrigerante");
        System.out.println("listaDeBebidas.add(\"Sucos\");");
        listaDeBebidas.add("Sucos");

        System.out.println("listaDeBebidas = " + listaDeBebidas);

        System.out.println("padaria.add(listaDeprodutos);");
        padaria.add(listaDeprodutos);
        System.out.println("padaria .add(listaDeBebidas);");
        padaria .add(listaDeBebidas);

        System.out.println("padaria: " + padaria);

        System.out.println("padaria.get(0); =" + padaria.get(0));

        System.out.println("padaria.get(0).get(0); = " + padaria.get(0).get(0));


    }
}
