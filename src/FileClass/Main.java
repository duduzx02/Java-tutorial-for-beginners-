package FileClass;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/FileClass/arquivo.txt");

        if (file.exists()) {
            System.out.println("O arquivo existe!");
            System.out.println("Caminho do arquivo: " + file.getPath());
            System.out.println("Caminho absoluto: " + file.getAbsolutePath());
            System.out.println("É um arquivo? " + file.isFile());
        } else {
            System.out.println("O arquivo não existe!");
        }



        // deletando o arquivo
        file.delete();
    }
}
