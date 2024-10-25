package Aula5;
public class exercicio6 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int  i = 0;

        while (i < 10) {
            System.out.println(a);
            int j= a + b;
            a = b;
            b = j;
            i++;
        }
    }
}
