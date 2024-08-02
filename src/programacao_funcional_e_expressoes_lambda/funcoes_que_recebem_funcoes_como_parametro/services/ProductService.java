package programacao_funcional_e_expressoes_lambda.funcoes_que_recebem_funcoes_como_parametro.services;

import programacao_funcional_e_expressoes_lambda.function.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p : list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
