package com.java.factorymethod;

public class Usuario {
    
    private Usuario() {}

    public static void ejecutar() {
        Cliente cliente;
        cliente = new ClienteContado();
        cliente.nuevoPedido(2000D);
        cliente.nuevoPedido(10000D);
        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000D);
        cliente.nuevoPedido(10000D);
    }
}
