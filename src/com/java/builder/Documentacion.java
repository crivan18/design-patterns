package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion {
    protected List<String> documentos = new ArrayList<String>();

    protected abstract void agregar(String documento);

    protected abstract void imprime();
}
