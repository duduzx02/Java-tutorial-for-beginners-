import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        String[] animais = {"Gato", "Cachorro", "Rato", "Pássaro"};

        for(String animal: animais){
            System.out.println(animal);
        }


        ArrayList<String> animaisList = new ArrayList<>();
        animaisList.add("gato");
        animaisList.add("cachorro");
        animaisList.add("rato");
        animaisList.add("pássaro");

        for(String animal: animais){
            System.out.println(animal);
        }

    }

}
