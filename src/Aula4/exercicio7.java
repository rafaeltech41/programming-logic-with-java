package Aula4;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira dois números:\nnúmero 1:");
        double n1 = scanner.nextDouble();
        System.out.println("número 2:" );
        double n2 = scanner.nextDouble();
        System.out.println("escolha uma das seguintes operações:\n1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        byte escolha = scanner.nextByte();
        switch (escolha) {
            case 1:
                double soma = n1+n2;
                System.out.println(n1+" + "+n2+" = "+soma);
            break;
            case 2:
                double subtracao = n1-n2;
                System.out.println(n1+" - "+n2+" = "+subtracao);
                break;
            case 3:
                double multiplicacao = n1*n2;
                System.out.println(n1+" * "+n2+" = "+multiplicacao);
                break;
            case 4:
                double divisao = n1/n2;
                System.out.println(n1+" / "+n2+" = "+divisao);}
        scanner.close();
    }
    }





