package OOP.Constructors;

public class MainHuman {
    public static void main(String[] args) {
        var eduardo = new Human("Eduardo", 27, 104);

        System.out.println(eduardo.getNome());
        System.out.println(eduardo.getIdade());
        System.out.println(eduardo.getPeso());

        eduardo.come();
        eduardo.drink();
    }
}
