package programacao_funcional_e_expressoes_lambda.predicate.util;

import programacao_funcional_e_expressoes_lambda.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
