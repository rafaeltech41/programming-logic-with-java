package Aula8;

import java.io.FileWriter;
import java.io.IOException;

public class exemplo3 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\IdeaProjects\\Java\\src\\arquivo.txt",true);
            fileWriter.write("texto gravado no modo append");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
