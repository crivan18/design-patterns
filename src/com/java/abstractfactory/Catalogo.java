package com.java.abstractfactory;

import java.util.Scanner;

public class Catalogo {
    private static int nAutos = 3;
    private static int nScooters = 2;

    private Catalogo () {}

    public static void ejecutar() throws Exception {
        Scanner reader = new Scanner(System.in);
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        FabricaVehiculo fabrica;
        System.out.println("Desea utilizar vehiculos de tipo:\nVehiculos electricos (1).\nVehiculos de gasolina (2).");
        int eleccion = reader.nextInt();
        switch (eleccion) {
            case 1: fabrica = new FabricaVehiculoElectricidad(); break;
            case 2: fabrica = new FabricaVehiculoGasolina(); break;
            default: throw new Exception("Class Not Found Exception");
        }
        for (int i = 0; i < nAutos; i++) {
            autos[i] = fabrica.crearAutomovil("Estandar", "Amarillo", 6+i, 3.2);
        }
        for (int i = 0; i < nScooters; i++) {
            scooters[i] = fabrica.crearScooter("Clasico", "Rojo", 2+i);
        }
        for (Automovil auto : autos) {
            auto.mostrarCaracteristicas();
        }
        System.out.println("-----------------------");
        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }
    }
}
