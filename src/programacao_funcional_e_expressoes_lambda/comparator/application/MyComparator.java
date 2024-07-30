package programacao_funcional_e_expressoes_lambda.comparator.application;

import programacao_funcional_e_expressoes_lambda.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
