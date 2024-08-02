package programacao_funcional_e_expressoes_lambda.function.application;

import programacao_funcional_e_expressoes_lambda.function.entities.Product;
import programacao_funcional_e_expressoes_lambda.function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> names = list.stream().map(func).toList();

        names.forEach(System.out::println);

    }
}
