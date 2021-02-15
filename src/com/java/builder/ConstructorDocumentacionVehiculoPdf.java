package com.java.builder;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo {
    
    public ConstructorDocumentacionVehiculoPdf() {
        documentacion = new DocumentacionPdf();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<pdf>Solicitud de pedido para el cliente: "+ nombreCliente +"</pdf>";
        documentacion.agregar(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreCliente) {
        String documento = "<pdf>Solicitud de matriculacion para el cliente: "+ nombreCliente +"</pdf>";
        documentacion.agregar(documento);
    }
}
