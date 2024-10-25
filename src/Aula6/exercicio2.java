package Aula6;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do {
            System.out.println("Deseja iniciar o sistema?\n sim[s] \n não[n]");
            String sistema = scanner.next();

            if (sistema.equals("s")) {

                String[] vetorCaracter = {"a", "j", "s", "d", "w", "c"};
                System.out.println("Busca de caracteres em um vetor.\nDigite uma letra a seguir e descubra se tem no vetor:");
                String buscaVetor = scanner.next();

                boolean encontrado = false;

                // Usando um laço for para evitar repetição
                for (int j = 0; j < vetorCaracter.length; j++) {
                    if (buscaVetor.equals(vetorCaracter[j])) {
                        System.out.println("A letra " + vetorCaracter[j] + " está no vetor na posição: " + (j + 1));
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("A letra " + buscaVetor + " não foi encontrada no vetor.");
                }

            } else if (sistema.equals("n")) {
                i++;
            } else {
                System.out.println("\nEntrada inválida. Fim do sistema.");
            }
        } while (i < 1);

        System.out.println("\nFim do sistema.");
        scanner.close();
    }
}
