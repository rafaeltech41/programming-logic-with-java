package Aula6;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                int linha =0;
                System.out.println("insira numero "+""+c);

                matriz[0][c] = scanner.nextInt();
            }
        }
        System.out.println(matriz[0][0]);

    }
}
