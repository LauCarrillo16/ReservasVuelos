package com.mycompany.reservadevuelos;

import java.util.Scanner;

public class ReservaDeVuelos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Que tipo de vuelo desea?");
        System.out.println("1. Nacional | 2. Internacional");
        int tipoVuelo = scanner.nextInt();
        
        System.out.println("Ingrese el lugar de origen");
        String origen = scanner.nextLine();
        System.out.println("Ingrese el lugar de destino");
        String destino = scanner.nextLine();
        scanner.nextLine();
        
        Vuelo vuelo;
        if (tipoVuelo == 1){
            vuelo = new VueloNacional(origen, destino);
        } else {
            vuelo = new VueloInternacional(origen, destino);
        }
        
        System.out.println("Selecciona la clase de asiento");
        System.out.println("1. Economica | 2. Ejecutiva");
        int tipoClase = scanner.nextInt();
        scanner.nextLine();
        
        Asiento asiento;
        if (tipoClase == 1){
            asiento = new Asiento("Economica");
        } else {
            asiento = new Asiento("Ejecutivo");
        }
        
        Reserva reserva = new Reserva(vuelo, asiento);
        
        while (true){
            System.out.println("___ Menu de Reservas ___");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Calcular Valor Total");
            System.out.println("3. Cacelar Reserva");
            System.out.println("4. Salir");
            
            int opc = scanner.nextInt();
            scanner.nextLine();
            
            switch(opc){
                case 1:
                    reserva.realizarReserva();
                    break;
                case 2:
                    System.out.println("Valor Total de la reserva: $" + reserva.calcularValorTotal());
                    break;
                case 3:
                    reserva.cancelarReserva();
                    break;
                case 4:
                    System.out.println("Saliendo del Sistema de Reservas");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }
        }
    }
}
