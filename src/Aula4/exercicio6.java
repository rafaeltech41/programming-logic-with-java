package Aula4;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira sua nota: ");
        double nota = scanner.nextDouble();
        if (nota>7){
            System.out.println("aprovado");
        } else if (nota>=5 && nota<7) {
            System.out.println("Em recuperação");
        }else{
            System.out.println("reprovado");
        }
    }
}
