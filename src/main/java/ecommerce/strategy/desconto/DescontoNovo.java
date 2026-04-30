package ecommerce.strategy.desconto;

import java.math.BigDecimal;

public class DescontoNovo implements DescontoStrategy {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return BigDecimal.ZERO;
    }
}
