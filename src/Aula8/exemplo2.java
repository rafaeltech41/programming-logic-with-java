package Aula8;

import java.io.FileWriter;
import java.io.IOException;

public class exemplo2 {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\Aluno\\Java\\src\\arquivo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
