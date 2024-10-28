package Aula8;

import java.io.*;
import java.util.Scanner;

public class desafio3_professor {

    static String[][] matrizCadastro = {null};
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static Scanner scanner = new Scanner(System.in);
    static File arquivo = new File("C:\\Users\\Aluno\\IdeaProjects\\Java\\src\\Aula8\\bancoDeDados.txt");

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Para cadastrar um usuário");
            System.out.println("2 - Para exibir o cadastro");
            System.out.println("3 - Para atualizar um usuário");
            System.out.println("4 - Para deletar um usuário");
            System.out.println("5 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    exibirCadastro();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do Programa!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    private static void cadastrarUsuario() {
        System.out.print("digite a quantidade de pessoas a serem cadastradas:");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[qtdPessoas + matrizCadastro.length][matrizCadastro[0].length];

        // copiar matrizCadastro para nova matriz
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }

        System.out.println("Preencha os dados a seguir: ");

        // Preenche novos usuários na novaMatriz
        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {
            novaMatriz[linhas][0] = String.valueOf(linhas);
            System.out.println(matrizCadastro[0][0] + " - " + linhas);

            for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();

    }

    private static void exibirCadastro() {
        String tabela = "";
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }

    private static void atualizarUsuario() {
        exibirCadastro();
        System.out.print("Digite o id do usuario que deseja atualizar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Atualize as informações a seguir:");
        System.out.println(matrizCadastro[0][0] + " - " + idUsuario);

        for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
            System.out.print(matrizCadastro[0][colunas] + ": ");
            matrizCadastro[idUsuario][colunas] = scanner.nextLine();
        }
        System.out.println("Usuário atualizado com sucesso!");
        exibirCadastro();
        salvarDadosNoArquivo();

    }
    private static void deletarUsuario(){
        exibirCadastro();
        System.out.print("Digite o id do usuario que deseja deletar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();

        String[][] novaMatriz =  new String[matrizCadastro.length-1][matrizCadastro[0].length];
        novaMatriz[0] = cabecalho;

        for (int linhasMatrizCadastro = 1, linhasNovaM = 1; linhasMatrizCadastro < matrizCadastro.length; linhasMatrizCadastro++) {
            if(linhasMatrizCadastro == idUsuario){
                continue;
            }
            novaMatriz[linhasNovaM] = matrizCadastro[linhasMatrizCadastro];
            novaMatriz[linhasNovaM][0] = String.valueOf(linhasNovaM);
            linhasNovaM++;
        }
        matrizCadastro = novaMatriz;
        System.out.println("Usuário deletado com sucesso!");
        exibirCadastro();
        salvarDadosNoArquivo();
    }
    private static void salvarDadosNoArquivo(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo))){
            for (String[]linhaMatriz : matrizCadastro){
                bufferedWriter.write(String.join(" - ",linhaMatriz)+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void carregarDadosDoArquivo(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
            if (!arquivo.exists()){
                return;
            }
            int qtdLinhas = 0;
            String linha ="";
            while((linha = bufferedReader.readLine())!=null){
                qtdLinhas++;
            }
            String[] linhasArquivo = new String[qtdLinhas];

            for (int linhas = 0; linhas < qtdLinhas; linhas++) {

            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}




