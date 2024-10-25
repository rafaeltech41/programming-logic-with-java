package Aula5;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = 6;
        double nota = 0;
        double notaFinal = 0;
        try {


        System.out.println("insira cinco notas: ");
        for (int i = 1; i <j ; i++) {
            System.out.print("insira nota "+i+" \t");
            nota = scanner.nextDouble();
            notaFinal += nota;
        }

        System.out.print("Média: "+notaFinal/5);} catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
