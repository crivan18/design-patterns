package com.java.abstractfactory;

public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        String caracteristicas = "Scooter electrico" +
            "\nModelo: " + modelo +
            "\nColor: " + color +
            "\nPotencia: " + potencia;
        System.out.println(caracteristicas);
    }
}
