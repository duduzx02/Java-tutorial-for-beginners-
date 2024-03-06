public class OutSite {
    private String x = "Helloo";

    public class Inside{
        private String y = "World";

        public void greeting(){
            System.out.println(x + " " + y);
        }
    }
}

class Main{
    public static void main(String[] args) {
        OutSite out = new OutSite();
        OutSite.Inside in = out.new Inside();
        in.greeting();
    }
}
