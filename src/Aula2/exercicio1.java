package Aula2;
import java.util.Scanner;
public class exercicio1 {
        public static void main(String[] args) {
                //Declaração e inicialização de Variáveis
                Scanner scanner = new Scanner(System.in);
                System.out.println("insira sua idade: ");
                int idade = scanner.nextInt();
                System.out.println("insira sua altura: ");
                float altura = scanner.nextFloat();
                System.out.println("insira seu peso:");
                double peso = scanner.nextDouble();
                System.out.println("idade: "+idade+"anos");
                System.out.println("altura: "+altura);
                System.out.println("peso :"+peso);

        }

}
