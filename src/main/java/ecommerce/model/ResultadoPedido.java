package ecommerce.model;

import java.math.BigDecimal;

public record ResultadoPedido(
        BigDecimal valorOriginal,
        BigDecimal desconto,
        BigDecimal frete,
        BigDecimal valorFinal) {
}
