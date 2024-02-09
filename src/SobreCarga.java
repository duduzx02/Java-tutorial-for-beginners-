public class SobreCarga {

    public static int adicionar(int a, int b){
        return a +b;
    }

    public static int adicionar(int a, int b, int c){
        return a + b + c;
    }

    public static int adicionar(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(adicionar(1, 2));
        System.out.println(adicionar(1, 2, 3));
        System.out.println(adicionar(1, 2 , 3 ,4));
    }
}
