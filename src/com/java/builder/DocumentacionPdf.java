package com.java.builder;

public class DocumentacionPdf extends Documentacion {
    
    @Override
    public void agregar(String documento) {
        documentos.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimiendo PDF");
        for (String documento : documentos) {
            System.out.println(documento);
        }
    }
}
