package com.java.abstractfactory;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        String caracteristicas = "Automovil electrico" +
        "\nModelo: " + modelo +
        "\nColor: " + color + 
        "\nPotencia: " + potencia + 
        "\nEspacio: " + espacio;
        System.out.println(caracteristicas);
    }
}
