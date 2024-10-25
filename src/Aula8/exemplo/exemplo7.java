package Aula8.exemplo;

import java.io.BufferedReader;
import java.io.FileReader;

public class exemplo7 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Aluno\\Java\\src\\Aula8\\alunos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}