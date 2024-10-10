package Aula4;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira sua idade: ");
        int idade = scanner.nextInt();
        if (idade<18){
            System.out.println("acesso negado");
        }else{
            System.out.println("acesso permitido");
        }
        System.out.println("fim do sistema.");
    }
}
