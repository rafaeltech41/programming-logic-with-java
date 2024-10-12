package Aula4;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasTrabalho;
        int valorHora ;
        double valorExtra ;

        System.out.println("insira a quantidade de horasTrabalho trabalhadas:");
         horasTrabalho = scanner.nextInt();
        valorHora = horasTrabalho*10;

        if(horasTrabalho >40){
            int var = horasTrabalho-40;
            valorExtra = (10*var)+(var*5);
            System.out.println("você fez hora extra. horas trabalhadas a mais: "
            +(horasTrabalho-40)+"H \n cada hora a mais trabalhada o funcionário recebe 50% a mais do que o normal. \n valor da hora extra: "+"R$"+valorExtra);
            System.out.println("valor total de trabalho + hora extra: "+ "R$"+(valorHora+valorExtra));
        }else{  System.out.println("R$"+valorHora);}


    }
}
