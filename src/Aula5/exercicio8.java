package Aula5;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0,impar = 0,par = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("insira o numero "+(i+1)+":");
            numero = scanner.nextInt();
            if (numero%2==0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.print("numeros pares: "+par+"\nnumeros impares: "+impar);
    }
}
