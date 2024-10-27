package Aula5;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero,par = 0,impar =0;

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


                    par++;

                }
                else if(!(numero%2==0)){

                    impar++;



                }
            }else{
                System.out.println("Fim do programa.");
                break;
            }


        }
        System.out.println();
        System.out.println("quantidade de número(s) par(es): "+par+" quantidade de número(s) impar(es): "+impar);
        }
    }