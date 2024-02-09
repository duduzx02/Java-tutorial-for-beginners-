public class ArrayList {

    public static void main(String[] args) {
        java.util.ArrayList<String> food = new java.util.ArrayList<>();
        System.out.println("food.add(\"Pizza\");" + food.add("Pizza"));
        System.out.println("food.add(\"Hamburger\");" + food.add("Hamburguer"));
        System.out.println("food.add(\"Hotdog\");" + food.add("hotdog"));

        System.out.println(food);
        for (int i = 0; i < food.size(); i++) {
            System.out.println("food.get(i)); = " + food.get(i));
        }

        System.out.println("food.set(2,\"Sushi\");" + food.set(2, "Sushi"));
        // set() substitu um elemento em um índice específico.

        System.out.println(food);

        System.out.println("food.remove(2)" + food.remove(2));
        // remove() remove um elemento em um índice específico

        System.out.println(food);

        System.out.println("food.clear()");
        food.clear();
        // clear() remove todos os elementos do ArrayList

        System.out.println(food);

    }
}
