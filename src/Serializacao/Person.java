package Serializacao;

import java.io.*;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        // Objeto a ser serializado
        Person person = new Person("Eduardo", 28);

        // Serialização do objeto
        try{
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado e salvo em person.ser");
        } catch (IOException i){
            i.printStackTrace();
        }

        // Desserialização do objeto
        try{
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person serializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Objeto desserializado: " + serializedPerson);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Person não encontrada.");
            c.printStackTrace();
        }
    }
}
