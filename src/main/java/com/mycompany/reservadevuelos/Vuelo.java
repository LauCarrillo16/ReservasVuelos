package com.mycompany.reservadevuelos;

public class Vuelo {
    String origen;
    String destino;
    double precioBase;
    
    public Vuelo(String origen, String destino){
        this.origen = origen;
        this.destino = destino;
        this.precioBase = 100000;
    }
    
    public double calcularValor(){
        return precioBase;
    }
    
}
