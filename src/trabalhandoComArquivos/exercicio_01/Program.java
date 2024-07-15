package trabalhandoComArquivos.exercicio_01;

import trabalhandoComArquivos.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        System.out.println(sourceFolderStr);

        boolean succes = new File(sourceFolderStr + "\\out").mkdir();


        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCsv =br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

            for (Product product : products) {
                bw.write(product.getName() + "," + String.format("%.2f", product.total()));
                bw.newLine();
            }

        }catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }



        sc.close();
    }
}
