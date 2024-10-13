package Aula4;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira a avaliação de desempenho de um funcionário:");
        byte escolha = scanner.nextByte();
        switch (escolha) {
            case 1:
                System.out.println("Precisa melhorar");
            break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
            break;
            case 5:
                System.out.println("Excelente");}
        scanner.close();
    }
    }





