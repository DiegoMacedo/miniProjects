package ecommerce.service;

import ecommerce.factory.DescontoFactory;
import ecommerce.model.ResultadoPedido;
import ecommerce.model.TipoCliente;
import ecommerce.strategy.desconto.DescontoStrategy;
import ecommerce.strategy.frete.FretePadrao;

import java.math.BigDecimal;

public class PedidoService {
    public ResultadoPedido processar(BigDecimal valorCompra, TipoCliente tipoCliente) {
        DescontoStrategy descontoStrategy = DescontoFactory.getStrattegy(tipoCliente);

        BigDecimal desconto = descontoStrategy.calcular(valorCompra);
        BigDecimal valorComDesconto = valorCompra.subtract(desconto);

        FretePadrao freteStrategy = new FretePadrao();
        BigDecimal frete = freteStrategy.calcular(valorComDesconto);

        BigDecimal valorFinal = valorComDesconto.add(frete);

        return new ResultadoPedido(valorCompra, desconto, frete, valorFinal);
    }
}
