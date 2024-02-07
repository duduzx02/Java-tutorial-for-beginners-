public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] motos = new String[3];

        motos[0] = "Honda";
        motos[1] = "Yamaha";
        motos[2] = "Shynerai";

        for (int i = 0; i < motos.length; i++) {
            System.out.println(motos[i]);
        }
    }
}
