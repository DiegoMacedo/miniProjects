package ecommerce.strategy.frete;

import java.math.BigDecimal;

public interface FreteStrategy {
    BigDecimal calcular(BigDecimal valorComDesconto);
}
