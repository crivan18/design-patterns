package com.java.factorymethod;

public abstract class Pedido {
    protected double importe;

    protected Pedido(double importe) {
        this.importe = importe;
    }
    
    protected abstract boolean valida();

    protected abstract void paga();
}
