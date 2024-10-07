package Aula7;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("insira um numero inteiro e o metodo dobro ira dobrar.");
        int scanner = sc.nextInt();
        int x = dobrar(scanner);
        System.out.println("o dobro de "+ scanner+" é "+x);
    }
    public static int dobrar(int numero){
        return numero*2;
    }
}
