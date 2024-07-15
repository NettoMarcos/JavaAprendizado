package trabalhandoComArquivos.aula4.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\marco\\Documents\\out.txt";

        /*caso não queira recriar o arquivo apenas inserir novos dados
        em new FileWritter adicionar um true:
        new FileWriter(path, true)
         */
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
