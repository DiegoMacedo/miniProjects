package ecommerce.strategy.desconto;

import java.math.BigDecimal;

public class DescontoRegular implements DescontoStrategy {
    @Override
    public BigDecimal calcular(BigDecimal valor) {
        if (valor.compareTo(new BigDecimal("100")) > 0) {
            return valor.multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }
}
