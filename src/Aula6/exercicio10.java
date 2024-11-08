package Aula6;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int nMatriz = matriz[0][0];

        int i = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.println("insira o numero "+(i)+":");
                matriz[l][c]=scanner.nextInt();
                i++;
                if (matriz[l][c]>nMatriz){
                    nMatriz = matriz[l][c];
                }

            }
        }
        System.out.println("o maior número da matriz é "+nMatriz);
    }
}
