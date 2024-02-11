package toString;

public class Car {
    private String marca = "Ford";
    private String modelo = "Mustang";
    private String cor = "Red";
    private int ano = 2024;

    public Car(){

    }


    @Override
    public String toString() {
        String myString = "Marca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nAno: " + ano ;
        return myString ;
    }
}
