package com.java.builder;

public class Vendedor {
    private ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        constructor.construyeSolicitudPedido(nombreCliente);
        constructor.construyeSolicitudMatriculacion(nombreCliente);
        return constructor.resultado();
    }
}
