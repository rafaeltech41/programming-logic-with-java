package Aula6;

import java.util.Scanner;

public class desafio1_professor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID","Nome","Telefone","Email"};
        String[][] matrizCadastro = new String[qtdPessoas+1][4];

        System.out.println("preencha os dados a seguir: ");
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            System.out.print("ID - ");
            matrizCadastro[linhas][0] =scanner.nextLine();
            System.out.print("Nome - ");
            matrizCadastro[linhas][1] =scanner.nextLine();
            System.out.print("Telefone - ");
            matrizCadastro[linhas][2] =scanner.nextLine();
            System.out.println("Email - ");
            matrizCadastro[linhas][3] =scanner.nextLine();
        }

        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
            System.out.println(matrizCadastro[linhas][0]+"\t"+matrizCadastro[linhas][2
                    ]+"\t\t\t"+matrizCadastro[linhas][3]);
        }
    }
}
