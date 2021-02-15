package com.java.abstractfactory;

public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;


    protected Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    protected abstract void mostrarCaracteristicas();

}
