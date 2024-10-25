package Aula8.exemplo;

import java.io.File;
import java.io.FileReader;

public class exemplo4 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Java\\src\\Aula8\\exemplo\\arquivo.txt");
        try {
            if (arquivo.exists()){
                FileReader fileReader = new FileReader(arquivo);
                int caracter;
                while ((caracter = fileReader.read()) != -1){
                    System.out.println((char) caracter);
                }
            }else {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
