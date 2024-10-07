package Aula8;

import java.io.File;

public class exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File ("C:\\Users\\Aluno\\Java\\src\\arquivo.txt");

        if(arquivo.exists()){
            System.out.println("arquivo existe");
        }else{
            System.out.println("arquivo não existe");
        }
    }
}
