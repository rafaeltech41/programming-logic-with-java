package Aula2;
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira a largura do retângulo: ");
        float largura = scanner.nextFloat();
        System.out.println("insira a altura do retângulo: ");
        float altura = scanner.nextFloat();
        float retangulo = largura*altura;
        System.out.println("area do retângulo: "+ retangulo);

    }
}
