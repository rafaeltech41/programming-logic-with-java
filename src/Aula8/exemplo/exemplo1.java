package Aula8.exemplo;

import java.io.File;
import java.io.IOException;

//
//public class exemplo1 {
//    public static void main(String[] args) {
//        File arquivo = new File ("C:\\Users\\Aluno\\Java\\src\\arquivo.txt");
//
//        if(arquivo.exists()){
//            System.out.println("arquivo existe");
//        }else{
//            System.out.println("arquivo não existe");
//        }
//    }
//}
public class exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\IdeaProjects\\Java\\src\\java2.txt");
        if (arquivo.exists()){
            System.out.println("arquivo existe");
        }else{
            try {
                if(arquivo.createNewFile()){
                    System.out.println("arquivo criado com sucesso "+arquivo.getName());
                }else{
                    System.out.println("falha ao criar o arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("fim do sistema");
    }
}
