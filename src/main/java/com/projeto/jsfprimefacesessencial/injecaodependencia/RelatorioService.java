package com.projeto.jsfprimefacesessencial.injecaodependencia;

import java.math.BigDecimal;
import javax.inject.Inject;

public class RelatorioService {

    @Inject
    private Pedidos pedido;

    
    public RelatorioService(Pedidos pedido) {
        this.pedido = pedido;
    }
    

    public RelatorioService() {
    }

    public BigDecimal totalPedidosMesAtual() {

        return pedido.totalPedidosMesAtual();

    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }
    
    
    

}
