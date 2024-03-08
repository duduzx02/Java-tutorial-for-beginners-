package Lambda;

import java.util.ArrayList;
import java.util.List;

public class easy {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("bob");
        nomes.add("Chalie");

        nomes.forEach(nome -> System.out.println(nome));
    }
}
