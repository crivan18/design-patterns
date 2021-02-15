package com.java.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    protected List<Pedido> pedidos = new ArrayList<>();

    public void nuevoPedido(double importe) {
        Pedido pedido = creaPedido(importe);
        if (!pedido.valida()) {
            return;
        }
        pedido.paga();
        pedidos.add(pedido);
    }

    protected abstract Pedido creaPedido(double importe);
}
