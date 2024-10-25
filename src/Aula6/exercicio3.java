package Aula6;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean[] vetorBoolean = new boolean[8];

        // Contadores de true e false
        int contadorTrue = 0;
        int contadorFalse = 0;


        for (int i = 0; i < vetorBoolean.length; i++) {
            System.out.println("Insira true ou false para o vetor na posição " + (i + 1) + ":");
            String entrada = scanner.next();
            if (entrada.equalsIgnoreCase("true")) {
                vetorBoolean[i] = true;
                contadorTrue++;
            } else if (entrada.equalsIgnoreCase("false")) {
                vetorBoolean[i] = false;
                contadorFalse++;
            } else {
                System.out.println("Entrada inválida! Por favor, insira true ou false.");
                i--;
            }
        }


        System.out.println("valores 'true': " + contadorTrue);
        System.out.println("valores 'false': " + contadorFalse);

        scanner.close();
    }
}
