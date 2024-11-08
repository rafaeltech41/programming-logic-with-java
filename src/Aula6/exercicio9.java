package Aula6;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];

        int impares = 0;
        int pares = 0;

        int i = 0;

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {


                System.out.println("insira o numero "+(i)+":");
                matriz[l][c]=scanner.nextDouble();
               if (matriz[l][c] %2==0){
                   pares++;
               } else{
                   impares++;
               }
                i++;
            }
        }

        System.out.println("numeros impares: "+impares+" numeros pares: "+pares);



    }
}
