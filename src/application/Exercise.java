package application;

import auxiliary.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Produto> sumario = new ArrayList<>();
        String strFolderPath = "C://temp";
        String strFilePath = strFolderPath + "//source.txt";
        String srtFileSum = strFolderPath + "//out//summary.csv";
        File path = new File(strFilePath);
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String[] item = line.split(",");
                String nome = item[0];
                Double price = Double.parseDouble(item[1]);
                int quantity = Integer.parseInt(item[2]);
                sumario.add(new Produto(nome, price, quantity));
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (!new File(strFolderPath + "//out").exists()) {
                new File(strFolderPath + "//out").mkdir();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(srtFileSum))) {
                for (Produto item : sumario) {
                    bw.write(item.getName() + ", " + item.getFullPrice());
                    bw.newLine();
                }
                System.out.println("Finalizado!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
