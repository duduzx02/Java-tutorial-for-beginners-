package ClassesInternasAnonimas;

public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public void introduce(){
        Greetings greetings = new Greetings() {
            @Override
            public String greet(String name) {
                return "Hello " + name + "!";
            }
        };

        System.out.println(greetings.greet(name));
    }
}
