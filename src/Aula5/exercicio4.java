package Aula5;
import java.util.Scanner;

public class exercicio4 {
        //verificação de numero primo
    public static void main(String[] args) {
        int numero, div = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("insira um número inteiro positivo");
        numero = scanner.nextInt();

        // Percorre todos os números de 1 até o valor de 'numero'
        for (int j = 1; j <= numero; j++) {
            // Verifica se 'numero' é divisível por 'j'
            if (numero % j == 0) {
                div++;  // Se for divisível, incrementa o contador de divisores
            }
        }

        // Se o número tiver exatamente 2 divisores (1 e ele mesmo), é primo
        if (div == 2) {
            System.out.println("numero primo");
        } else {
            // Caso contrário, o número não é primo
            System.out.println("esse numero não é primo.");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
