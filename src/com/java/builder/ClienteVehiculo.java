package com.java.builder;

import java.util.Scanner;

public class ClienteVehiculo {

    private ClienteVehiculo() {}
    
    public static void ejecutar() {
        Scanner reader = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor = null;
        Vendedor vendedor = null;
        Documentacion documentacion= null;
        System.out.println("Desea generar la documentacion:\nHTML (1).\nPDF (2).");
        int eleccion = reader.nextInt();
        switch (eleccion) {
            case 1: constructor = new ConstructorDocumentacionVehiculoHtml(); break;
            case 2: constructor = new ConstructorDocumentacionVehiculoPdf(); break;
            default: System.exit(0);
        }
        vendedor = new Vendedor(constructor);
        documentacion = vendedor.construye("Ivan Huerta");
        documentacion.imprime();
    }
}