package Aula5;

public class exercicio2 {

    public static void main(String[] args) {//soma de números pares
        int soma = 0; // Inicializa uma variável do tipo inteiro chamada "soma" com o valor 0. Essa variável armazenará a soma dos números pares.

        // Início de um laço "for" que irá de 1 até 100, com o incremento de 1 a cada iteração.
        for (int i = 1; i <= 100; i++) {

            // Verifica se o valor de "i" é par. Isso é feito usando o operador de módulo (%), que retorna o resto da divisão de "i" por 2.
            // Se o resto for 0 (i%2 == 0), significa que o número é par.
            if (i % 2 == 0) {

                // Se a condição acima for verdadeira (ou seja, "i" é um número par), o valor de "i" é adicionado à variável "soma".
                soma += i;
            }
        }

        // Após o término do laço, o valor da variável "soma" é impresso no console. Esse valor será a soma de todos os números pares de 1 a 100.
        System.out.println(soma);
    }
}
