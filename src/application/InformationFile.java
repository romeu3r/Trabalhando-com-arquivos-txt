package application;

import java.io.File;
import java.util.Scanner;

public class InformationFile {
    public static void main(String[] args) {
        //C:\temp\out.txt
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        System.out.println("GetName: " + path.getName());
        System.out.println("GetPath: " + path.getPath());
        System.out.println("GetParent: " + path.getParent());

        sc.close();
    }
}
