package com.mycompany.reservadevuelos;

public class VueloInternacional extends Vuelo{
    
    public VueloInternacional(String origen, String destino){
        super(origen, destino);
    }
    
    @Override
    public double calcularValor(){
        return precioBase * 1.3;
    }
    
}
