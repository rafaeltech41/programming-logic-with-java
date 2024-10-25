package Aula7;

import java.util.Scanner;

public class desafio2_professor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        String[][] matrizCadastro = {null};
        matrizCadastro[0]= cabecalho;
        int opcao;
        do {
            System.out.println("Escolha uma opção ");
            System.out.println(" 1 - Para cadastrar usuário ");
            System.out.println(" 2 - Para exibir usuário ");
            System.out.println(" 3 - Para atualizar usuário ");
            System.out.println(" 4 - Para deletar usuário ");
            System.out.println(" 5 - Sair ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    matrizCadastro = cadastrarUsuario(matrizCadastro);
break;
case 2:
    exibirCadastro(matrizCadastro, cabecalho);
    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        }while (opcao!=5);
//        matrizCadastro=  cadastrarUsuario(cabecalho);
//        exibirCadastro(matrizCadastro,cabecalho);
    }
    private static String[][] cadastrarUsuario(String[][]matrizCadastro) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz = new String[qtdPessoas + matrizCadastro.length][matrizCadastro[0].length];

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }
        System.out.println("preencha os dados a seguir: ");
        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }

        return novaMatriz;
    }

    private static void exibirCadastro(String[][] matrizCadastro, String[]cabecalho){
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";}
            tabela+="\n";}
        System.out.println(tabela);
    }
}
