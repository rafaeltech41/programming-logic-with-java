package Aula6;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[2][2];

        double soma = 0;

        int i = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {


                System.out.println("insira o numero "+(i)+":");
                matriz[l][c]=scanner.nextDouble();
                soma+=matriz[l][c];
                i++;
            }
        }
        System.out.println(soma);



    }
}
