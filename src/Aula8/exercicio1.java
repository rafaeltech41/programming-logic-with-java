package Aula8;

import java.io.File;
import java.io.IOException;

public class exercicio1 {
    public static void main(String[] args) {
    File arquivo = new File("aluno.txt");
    if (arquivo.exists()){
        System.out.println("fim do sistema");
    } else  {
        try {
            if (arquivo.createNewFile()){
                System.out.println(arquivo.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
