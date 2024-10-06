package Aula5;
import java.util.Scanner;

public class exercicio3 {
    //calculo de fatorial
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1; // Começa em 1, pois fatorial de 0 é 1

        System.out.println("Digite um numero positivo inteiro para calcular seu fatorial: ");
        int numero = scanner.nextInt();
        int i = numero; // Variável temporária para manter o valor original de 'numero'

        while (i > 1) { // Loop para calcular o fatorial
            fatorial *= i;
            i--;
        }

        System.out.println("O fatorial do numero " + numero + " é " + fatorial);
    }
}
