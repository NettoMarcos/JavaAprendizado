package programacao_funcional_e_expressoes_lambda.consumer.util;

import programacao_funcional_e_expressoes_lambda.consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
