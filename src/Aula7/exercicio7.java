package Aula7;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("insira 3 numeros e descubra qual é o maior");
        System.out.println(maiorNumero(sc.nextInt(), sc.nextInt(), sc.nextInt()));

    }
    public static int maiorNumero(int n1,int n2,int n3){
        int maior = 0;
        if (n1>n2 && n1>n3){
            maior = n1;
        } else if (n2>n3&&n2>n1) {
            maior = n2;
        } else if (n3>n1&&n3>n2) {
            maior = n3;
        }

        return maior;
    }
}
