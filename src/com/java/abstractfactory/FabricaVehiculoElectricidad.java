package com.java.abstractfactory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }
}
