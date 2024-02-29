package JavaFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderReader {
    public static void main(String[] args) {

        String fileNamee = "src/poem.txt";

        try{
            // Criando uma instância da classe FileReader
            FileReader reader = new FileReader(fileNamee);

            // Lendo o conteúdo do arquivo caractere po caractere
            int data;
            while((data = reader.read()) != -1) {
                char character = (char) data;
                System.out.print(character);
            }

            //Fechando o FileReader após a leitura

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo!");
            e.printStackTrace();
        }

    }
}
