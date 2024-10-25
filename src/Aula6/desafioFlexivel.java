package Aula6;

import java.util.Scanner;

public class desafioFlexivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        String[][] matrizCadastro = new String[qtdPessoas + 1][cabecalho.length];
        System.out.println("preencha os dados a seguir: ");
        matrizCadastro[0] = cabecalho;
        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.print(cabecalho[colunas] + ": ");
                matrizCadastro[linhas][colunas] = scanner.nextLine();
            }
        }
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";

            }
            tabela+="\n";
        }
        System.out.println(tabela);
    }}
