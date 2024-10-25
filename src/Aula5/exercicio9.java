package Aula5;

import java.util.Random;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
//        System.out.println(numeroAleatorio);
//        for (int i = 0; i < 1; i++) {
//            numero = scanner.nextInt();
//            if (numero ==numeroAleatorio){
//                System.out.println("BINGO");
//            }else{
//                System.out.println("tente novamente!");
//                i--;}
//        }
        Random random = new Random();
        int numeroAleatorio= random.nextInt(100);
        int numero = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(numeroAleatorio);
        System.out.print("jogo de adivinhação. \ndigite um numero de 0 a 100 a seguir: ");
        do {
            System.out.print("===>");
            numero = scanner.nextInt();
            i++;
        }while (!(numero==numeroAleatorio));

        System.out.println("BINGO!!! numero de tentativas feitas: "+i);
    }
}
