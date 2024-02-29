package JavaFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterWriter {
    public static void main(String[] args) {

        // Criando uma instância da classe FileWriter
        try{
            FileWriter writer = new FileWriter("poem.txt");

            // Escrevendo no arquivo
            writer.write("Roses are red\n");

            // Fechando o FileWriter
            writer.close();

            // Adicionando conteúdo adicional
            writer = new FileWriter("poem.txt", true);
            writer.append("\nA poem by Bro");

            // Fechando o FileWriter novamente;
            writer.close();

            System.out.println("Arquivo poem.txt criado e modificado com sucesso!");

        } catch (IOException e){
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
