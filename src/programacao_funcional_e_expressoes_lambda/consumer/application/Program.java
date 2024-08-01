package programacao_funcional_e_expressoes_lambda.consumer.application;

import programacao_funcional_e_expressoes_lambda.consumer.entities.Product;
import programacao_funcional_e_expressoes_lambda.consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(Product::nonStaticPriceUpdate);

        list.forEach(System.out::println);
    }
}
