package Aula8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class exercicio3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\Aluno\\Java\\src\\Aula8\\alunos.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\Java\\src\\Aula8\\backup_aluno.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);



            String linha;
            while ((linha= bufferedReader.readLine())!=null){
                bufferedWriter.write(linha+"\n");
            }
            fileReader.close();
            bufferedReader.close();
            bufferedWriter.close();
            fileWriter.close();
            fileReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
