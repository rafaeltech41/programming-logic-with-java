package Aula6;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        int soma = 0;


        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
int i = 0;

                    System.out.println("insira o numero "+(i+1)+":");
                    matriz[l][c]=scanner.nextInt();
i++;
             soma+=matriz[l][c];
            }
        }
        System.out.println(soma);



    }
}
