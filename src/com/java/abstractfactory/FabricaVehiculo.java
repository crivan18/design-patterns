package com.java.abstractfactory;

public interface FabricaVehiculo {
    Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter crearScooter(String modelo, String color, int potencia);
}
