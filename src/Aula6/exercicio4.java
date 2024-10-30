package Aula6;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double []vetorNotas = new double[4];
        double notaFinal = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("insira a nota: "+(i+1));
            vetorNotas[i] =scanner.nextDouble();
            notaFinal+=vetorNotas[i];
        }

        System.out.println("média de suas notas : "+ notaFinal/4);

    }
}