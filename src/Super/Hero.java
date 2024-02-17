package Super;

public class Hero extends Pessoa{
    String power;

    public Hero(String pessoa, int idade, String power) {
        super(pessoa, idade);
        this.power = power;
    }


    public String toString(){
        return super.toString() + "Superpoder: " + this.power + "\n";
    }
}
