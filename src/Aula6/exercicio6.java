package Aula6;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        matriz[0][0] = scanner.nextInt();
        matriz[0][1] = scanner.nextInt();
        matriz[1][0] = scanner.nextInt();
        matriz[1][1] = scanner.nextInt();
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println(matriz[l][c]);
            }
        }




    }
}
