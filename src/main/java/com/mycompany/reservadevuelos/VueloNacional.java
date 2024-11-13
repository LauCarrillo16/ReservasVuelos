package com.mycompany.reservadevuelos;

public class VueloNacional extends Vuelo{
    public VueloNacional(String origen, String destino){
        super(origen, destino);
    }
    
    @Override
    public double calcularValor(){
        return precioBase *1.1;
    }
}

    
