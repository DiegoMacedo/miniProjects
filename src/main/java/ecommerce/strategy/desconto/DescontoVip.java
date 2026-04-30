package ecommerce.strategy.desconto;

import java.math.BigDecimal;

public class DescontoVip implements DescontoStrategy {

    @Override
    public BigDecimal calcular(BigDecimal valor) {
        return valor.multiply(new BigDecimal("0.15"));
    }
}
