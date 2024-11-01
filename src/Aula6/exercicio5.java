package Aula6;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vetorString[] = new String[3];
        vetorString[0] = "Rafael";
        vetorString[1] = "Lucas";
        vetorString[2] = "Orrico";
        System.out.print("Insira qual nome deseja verificar no vetor: ");

        for (int i = 0; i < vetorString.length; i++) {

            String escolhaUser = scanner.nextLine();

            if (escolhaUser.equals(vetorString[0])) {
                System.out.println("nome " + vetorString[0] + " encontrado no vetor");
                break;
            } else if (escolhaUser.equals(vetorString[1])) {
                System.out.println("nome " + vetorString[1] + " encontrado no vetor");
            } else if (escolhaUser.equals(vetorString[2])) {
                System.out.println("nome " + vetorString[2] + " encontrado no vetor");

            } else {
                System.out.println("nome não encontrado no vetor.");
                System.out.print("Insira qual nome deseja verificar no vetor: ");

            }
        }
    }

}
