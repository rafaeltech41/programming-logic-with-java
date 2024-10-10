package Aula2;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        int valorHora = 70;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule seu salário insira quantas horas trabalhou essa semana:");
        int horasTrabalhadas = scanner.nextInt();
        int operaçaoMatematica = valorHora*horasTrabalhadas;
        System.out.println("R$"+operaçaoMatematica);

    }
}
