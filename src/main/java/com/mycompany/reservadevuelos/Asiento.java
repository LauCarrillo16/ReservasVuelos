package com.mycompany.reservadevuelos;

public class Asiento {
    String clase;
    
    public Asiento(String clase){
        this.clase = clase;
    }
    
    public double calcularValor(double valorVuelo){
        if (clase.equals("Economica")){
            return valorVuelo;
        } else if (clase.equals("Ejecutiva")){
            return valorVuelo * 1.5;
        }
        return valorVuelo;
    }
}
