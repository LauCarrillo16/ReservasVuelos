package com.mycompany.reservadevuelos;

public class Reserva {
    Vuelo vuelo;
    Asiento asiento;
    boolean reservada;
    
    public Reserva(Vuelo vuelo, Asiento asiento){
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.reservada = false;
    }
    
    public void realizarReserva(){
        if (!reservada){
            reservada = true;
            System.out.println("Realizaste tu Reserva con Exito!!!");
        } else {
            System.out.println("Ya tienes una Reserva");
        }
    }
    
    public void cancelarReserva(){
        if (reservada){
            reservada = false;
            System.out.println("Reserva Cancelada con Exito!!!");
        } else {
            System.out.println("No hay Reserva para Cancelar");
        }
    }
    
    public double calcularValorTotal(){
        if (!reservada){
            System.out.println("No Tienes Reserva, No se Puede Calcular el Valor");
            return 0;
        }
        double valorVuelo = vuelo.calcularValor();
        return asiento.calcularValor(valorVuelo);
    }
}
