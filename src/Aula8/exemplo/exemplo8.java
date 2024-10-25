package Aula8.exemplo;

public class exemplo8 {
    public static void main(String[] args) {

        String linha = "ID:1;Nome:Rafael;Idade:17 ";
        String [] tokens;
        tokens = linha.split(";");//o split quebra a string em varias partes quando lê a referência que no caso é: ;

        for (String token : tokens){
            System.out.println(token);
        }
        String[] id = tokens[0].split(":");
        String[] nome = tokens[1].split(":");
        String[] idade = tokens[2].split(":");
        System.out.println(id[1]+" "+nome[1]+" "+idade[1]);
        int soma = Integer.parseInt(idade[1].trim()); //trim tira os espaços antes e depois da string
        System.out.println(soma+1);
    }
}
