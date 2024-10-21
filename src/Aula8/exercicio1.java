package Aula8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            File alunos = new File("C:\\Users\\Aluno\\Java\\src\\Aula8\\alunos.txt");
            FileWriter writer = new FileWriter(alunos, true);
            for (int i = 1; i < 6; i++) {
                System.out.println("insira o nome do aluno " + i );
                  writer.write(scanner.next()+"\n");

            }
            writer.close();

            if (alunos.exists()) {

            } else {
                if (alunos.createNewFile()) {

                } else {

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
