package ecommerce.strategy.desconto;

import java.math.BigDecimal;

public interface DescontoStrategy {
    BigDecimal calcular(BigDecimal valor);

}
