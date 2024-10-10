package Aula2;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira suas notas e descubra sua nota final.");
        System.out.println("nota 1:");
        float n1 = scanner.nextFloat() ;
        System.out.println("nota 2:");
        float n2 = scanner.nextFloat() ;
        System.out.println("nota 3:");
        float n3 = scanner.nextFloat() ;
        float notaFinal = (n1+n2+n3)/3;
        System.out.println("sua nota final é: "+ notaFinal);

    }
}
