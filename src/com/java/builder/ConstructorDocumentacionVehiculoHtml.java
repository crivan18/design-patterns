package com.java.builder;

public class ConstructorDocumentacionVehiculoHtml extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHtml() {
        documentacion = new DocumentacionHtml();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<html>Solicitud de pedido para el cliente: " + nombreCliente + "</html>";
        documentacion.agregar(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreCliente) {
        String documento = "<html>Solicitud de matriculacion para el cliente: "+ nombreCliente +"</html>";
        documentacion.agregar(documento);
    }
}
