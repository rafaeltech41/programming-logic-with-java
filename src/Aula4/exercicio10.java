package Aula4;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dolar;
        double euro;
        double libra;
        System.out.print("conversão de moedas \ninsira um valor em reais: ");
        System.out.print("R$");
            double reais = scanner.nextFloat();
        System.out.print("1-Dolar\n2-Euro\n3-Libra\n= ");
            int escolha = scanner.nextByte();
        switch (escolha) {
            case 1:
            dolar = (reais/5.61);
                System.out.println("taxa de câmbio: R$5.61 = 1$\n seu saldo em dolar: $"+(int)dolar);
            break;
            case 2:
                euro = (reais/6.14);
                System.out.println("taxa de câmbio: R$6.14 = 1€\n seu saldo em euro: €"+(int)euro);
                break;
            case 3:
                libra = (reais/7.33);
                System.out.println("taxa de câmbio: R$7.33  = 1£\n seu saldo em libra: £"+(int)libra);

            }
        scanner.close();
    }
    }





