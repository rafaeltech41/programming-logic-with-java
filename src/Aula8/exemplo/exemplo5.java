package Aula8.exemplo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class exemplo5 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\ideaProjects\\AulasJava\\src\\Aula8\\Exemplos\\arquivo.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Texto a ser gravado no arquivo com buffer.");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}