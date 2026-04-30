package ecommerce.factory;

import ecommerce.model.TipoCliente;
import ecommerce.strategy.desconto.DescontoNovo;
import ecommerce.strategy.desconto.DescontoRegular;
import ecommerce.strategy.desconto.DescontoStrategy;
import ecommerce.strategy.desconto.DescontoVip;

public class DescontoFactory {
    public static DescontoStrategy getStrattegy(TipoCliente tipo) {
        return switch (tipo) {
            case VIP -> new DescontoVip();
            case REGULAR -> new DescontoRegular();
            case NOVO -> new DescontoNovo();
        };
    }
}
