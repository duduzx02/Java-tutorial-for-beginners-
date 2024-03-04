package HashMapMain;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Criando um HashMap
        HashMap<String, String> countries = new HashMap<>();

        // Adicionando elementos
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");
        countries.put("Brazil", "Brasilia");

        //
        System.out.println("Acessando elmentos");
        String capitalUSA = countries.get("USA");
        System.out.println(capitalUSA);

        //
        System.out.println("Removendo elementos!");
        countries.remove("Russia");

        //
        System.out.println("Verificando a presença de elementos");
        boolean containsEngland = countries.containsKey("England");
        System.out.println(containsEngland);

        //
        System.out.println("Iterando sobre o HashMap");
        for (String country: countries.keySet()) {
            System.out.print(country + " = ");
            System.out.println(countries.get(country));
        }

    }
}
