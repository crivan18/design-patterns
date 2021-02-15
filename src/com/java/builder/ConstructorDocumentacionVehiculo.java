package com.java.builder;

public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;
    
    protected abstract void construyeSolicitudPedido(String nombreCliente);

    protected abstract void construyeSolicitudMatriculacion(String nombreCliente);

    protected Documentacion resultado() {
        return documentacion;
    }
}
