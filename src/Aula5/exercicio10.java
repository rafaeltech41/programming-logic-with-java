package Aula5;

import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numero,par = 0,impar =0;
        int[]numeroPar = new int[0];
        int[]numeroImpar = new int[numero];

        System.out.println("insira números de um a cem:");
        for (int i = 0; i < 100; i++) {

            System.out.print("numero "+(i+1)+": ");
            numero = scanner.nextInt();


            if (numero>100) {
                System.out.println("número muito grande, interrupção realizada.");
                break;
            }
            if(numero>0) {
                if (numero%2==0) {
                    numeroPar =[numero];
                    par++;
                    System.out.println(numeroPar);
                    for (int j = 1; j < numeroPar.length; j++) {
                        System.out.println(numeroPar[j]);
                    }
                }
                else if(!(numero%2==0)){
                    numeroImpar =[numero];
                    impar++;
                    for (int j = 1; j < numeroImpar.length; j++) {
                        System.out.println(numeroImpar[j]);
                    }
                }
            }else{
                break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("quantidade de número(s) pare(s): "+par+" quantidade de número(s) impare(s): "+impar);
        }
    }