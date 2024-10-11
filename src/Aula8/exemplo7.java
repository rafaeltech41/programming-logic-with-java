package Aula8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exemplo7 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\arquivo.txt"));
            String texto = bufferedReader.readLine();
            System.out.println(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
