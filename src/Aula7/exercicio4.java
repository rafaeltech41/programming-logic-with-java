package Aula7;
import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("conversor de Celsius para fahrenheit: ");
        double c = sc.nextInt();
        double conversor = converterCelsiusParaFahrenheit(c)*1.8+32;
        System.out.println(conversor);
    }
    public static double converterCelsiusParaFahrenheit(double f){
        return f;
    }
}
