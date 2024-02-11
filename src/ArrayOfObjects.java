public class ArrayOfObjects {
    public static void main(String[] args) {


        // Normal arrays
        int[] numbers = new int[3];
        char[] chars = new char[4];
        String[] strings = new String[5];

        // Arrays de objetos
       // Food[] refrigeragor = new Food[3];
        var food1 = new Food("Pizza");
        var food2 = new Food("Hamburger");
        var food3 = new Food("Hot dog");

        Food[] refrigeragor = {food1, food2, food3};

       //refrigeragor[0] = food1;
        //refrigeragor[1] = food2;
       //refrigeragor[2] = food3;


        System.out.println(refrigeragor[0].getName());
        System.out.println(refrigeragor[1].getName());
        System.out.println(refrigeragor[2].getName());
    }
}



class Food{
    String name;

    public Food(String food){
        this.name = food;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
};
