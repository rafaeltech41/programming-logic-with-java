package Aula4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("insira o código do produto:");
            int codigoProduto = scanner.nextInt();

            switch(codigoProduto){
                case 1:
                    System.out.println("eletrônicos");
                    break;
                case 2:
                    System.out.println("alimento");
                    break;
                case 3:
                    System.out.println("vestuário");
                    break;
                default:
                    throw new IllegalStateException("esse codigo nao existente no sistema. " + codigoProduto);
            }

        }
        System.out.println("fim do sistema.");
        scanner.close();
    }
}
