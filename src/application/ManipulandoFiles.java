package application;

import java.io.File;
import java.util.Scanner;

public class ManipulandoFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        //Iteração de pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        //Iteração de arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File file : files) {
            System.out.println(file);
        }

        //Criando pastas
        boolean success = new File(strPath + "//testePasta").mkdir();
        System.out.println("Resultado da pastas: " + success);
    }
}
