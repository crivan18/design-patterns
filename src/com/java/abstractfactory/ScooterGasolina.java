package com.java.abstractfactory;

public class ScooterGasolina extends Scooter {
    
    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        String caracteristicas = "Scooter de gasolina" +
            "\nModelo: " + modelo +
            "\nColor: " + color +
            "\nPotencia: " + potencia;
        System.out.println(caracteristicas);
    }
}
