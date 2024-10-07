package Aula7;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um numero e descubra se ele é par ou impar:");
        if (verificarPar(sc.nextInt())){
            System.out.println("numero par");
        }else{
            System.out.println("numero impar");
        }


    }
    public static boolean verificarPar(int numero){
    return numero%2==0;
    }
}
