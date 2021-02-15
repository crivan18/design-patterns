package com.java.abstractfactory;

public abstract class Automovil {
    protected String modelo;
    protected String color;
    protected int potencia;
    protected double espacio;

    protected Automovil(String modelo, String color, int potencia, double espacio) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.espacio = espacio;
    }

    protected abstract void mostrarCaracteristicas();

}
