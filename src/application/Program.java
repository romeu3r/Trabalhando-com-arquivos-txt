package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Bom dia", "Boa tarde", "boa noite"};
        String path = "c://temp//out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true/*Ao marcar True ele manten o texto que ja existe no arquivo.*/))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
