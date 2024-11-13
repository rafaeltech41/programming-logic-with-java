package Aula7;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número:");
        System.out.println("o numero digitado é : "+calcularFatorial(scanner.nextInt()));
    }
    public static int calcularFatorial (int n1 ){
int  fatorial = n1;
int contador = 1 ;
do {
    n1 = n1*contador;
    contador++;
}while (contador<fatorial);
return n1;
    }
}
