package PassagemDeObjeto;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BWM", "Red");
        var tesla = new Car("tesla", "Blue");

        garage.park(tesla);
        garage.park(car);
    }
}
