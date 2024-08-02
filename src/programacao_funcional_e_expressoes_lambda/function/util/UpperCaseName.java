package programacao_funcional_e_expressoes_lambda.function.util;

import programacao_funcional_e_expressoes_lambda.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
