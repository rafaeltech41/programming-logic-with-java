package Aula7;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira suas três notas e descubra o resultado final:");
        System.out.println("nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("nota 3:");
        double nota3 = sc.nextDouble();
        double x = calcularMedia(nota1,nota2,nota3);
        System.out.println("nota final: "+x);

    }
    public static double calcularMedia(double n1, double n2, double n3){
        return n1+n2+n3/3;
    }

}
