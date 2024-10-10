package Aula4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            for (int j = 1; j <2; j++) {
                System.out.println("insira o valor das vendas do funcionário ");
                double valorVendas = scanner.nextDouble();
                if (valorVendas<1000){
                    System.out.println("a sua comissão é de 5%.");
                    System.out.println("comissão: " + valorVendas*0.05+"R$");
                    System.out.println("valor das vendas + comissão: "+(valorVendas+valorVendas*0.05)+"R$");
                } else if (valorVendas>=1000&&valorVendas<=5000) {
                    System.out.println("a sua comissão é de 10%.");
                    System.out.println("comissão: " + valorVendas*0.10+"R$");
                    System.out.println("valor das vendas + comissão: "+(valorVendas+valorVendas*0.10)+"R$");

                }else {
                    System.out.println("a sua comissão é de 15%.");
                    System.out.println("comissão: " + valorVendas*0.15+"R$");
                    System.out.println("valor das vendas + comissão: "+(valorVendas+valorVendas*0.15)+"R$");

                }

            }


        }
    }
}
