package Aula4;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        if (valorCompra>=100){
            System.out.println((valorCompra)-valorCompra*0.10);
        }else{
            System.out.println(valorCompra);
        }
        System.out.println("fim do programa.");
        scanner.close();
    }
}
