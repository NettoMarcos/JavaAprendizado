package programacao_funcional_e_expressoes_lambda.comparator.application;

import programacao_funcional_e_expressoes_lambda.comparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //outras versões do comparator com lambda

        /* OBJETO DE CLASSE ANÔNIMA

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

         */

        /* OBJETO DE EXPRESSÃO LAMBDA COM CHAVES

        Comparator<Product> comp = (p1, p2) ->{
            return  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

         */

        /* OBJETO DE EXPRESSÃO LAMBADA SEM CHAVES
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        */

        // COMPARADOR EXPRESSÃO LAMBDA DIRETO NO ARGUMENTO
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list){
            System.out.println(p);
        }
    }
}
