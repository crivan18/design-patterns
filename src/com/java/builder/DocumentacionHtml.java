package com.java.builder;

public class DocumentacionHtml extends Documentacion {
    
    @Override
    public void agregar(String documento) {
        documentos.add(documento);
    }

    @Override
    public void imprime() {
        System.out.println("Imprimiendo HTML");
        for (String documento : documentos) {
            System.out.println(documento);
        }
    }
}
