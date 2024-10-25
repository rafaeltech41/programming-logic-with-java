package Aula5;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;
        do {
            System.out.print("insira uma nota de 0 a 10:"+"\t");
            nota = scanner.nextInt();

        }
        while (nota>=11);
        System.out.println(nota);
    }
}
