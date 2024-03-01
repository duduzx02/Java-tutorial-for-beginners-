package Enum;

public class Main {
    public static void main(String[] args) {
        Planet myPlanet = Planet.EARTH;

        System.out.println(myPlanet);

        podeMorarAqui(myPlanet);

    }
        static void podeMorarAqui(Planet myPlanet){

            switch (myPlanet){
                case EARTH:
                    System.out.println("Você pode viver aqui!");
                    System.out.println("Este é o planeta #" + myPlanet.getNumber());
                    break;
                default:
                    System.out.println("Você não pode viver aqui!");
                    System.out.println("Este é o planeta #" + myPlanet.getNumber());
                    break;
            }


        }


}
