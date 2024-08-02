package programacao_funcional_e_expressoes_lambda.funcoes_que_recebem_funcoes_como_parametro.application;

import programacao_funcional_e_expressoes_lambda.funcoes_que_recebem_funcoes_como_parametro.services.ProductService;
import programacao_funcional_e_expressoes_lambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        char c = 'T';

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == c);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
