package Aula8.exemplo;

import java.io.FileWriter;
import java.io.IOException;

public class exemplo2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\Java\\src\\arquivo.txt");
            fileWriter.write("texto a ser gravado no arquivo");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
