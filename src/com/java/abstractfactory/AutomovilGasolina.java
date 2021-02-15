package com.java.abstractfactory;

public class AutomovilGasolina extends Automovil {

    public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        String caracteristicas = "Automovil de gasolina" +
            "\nModelo: " + modelo +
            "\nColor: " + color +
            "\nPotencia: " + potencia +
            "\nEspacio: " + espacio;
        System.out.println(caracteristicas);
    }
    
}
