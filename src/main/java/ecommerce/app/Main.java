package ecommerce.app;

import ecommerce.model.TipoCliente;
import ecommerce.service.PedidoService;

import java.math.BigDecimal;

public class Main {
    static void main() {
        PedidoService service = new PedidoService();
        var resultado = service.processar(new BigDecimal("600"), TipoCliente.VIP);

        System.out.println("Valor original: R$ " + resultado.valorOriginal());
        System.out.println("Desconto: R$ " + resultado.desconto());
        System.out.println("Frete: R$ " + resultado.frete());
        System.out.println("Valor final: R$ " + resultado.valorFinal());
    }
}
