package ecommerce.strategy.frete;

import java.math.BigDecimal;

public class FretePadrao implements FreteStrategy {
    @Override
    public BigDecimal calcular(BigDecimal valorComDesconto) {
        if (valorComDesconto.compareTo(new BigDecimal("500")) > 0) {
            return BigDecimal.ZERO;
        }
        return new BigDecimal("20");
    }
}
