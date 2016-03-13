package com.herprogramacion.restaurantericoparico.Configuraciones;

import java.util.ArrayList;

/**
 * Created by kaisitu on 12/03/2016.
 */
public class Radio extends Peticion{

    String nombre;
    Double frecuencia;

    public Radio(){

    }

    public Radio(String nombre, Double freq){
        this.nombre = nombre;
        this.frecuencia = freq;
    }

   public void setNombre(String nombre){
       this.nombre = nombre;
   }

    public String getNombre() {
        return nombre;
    }

    public void setFrecuencia(Double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Double getFrecuencia() {
        return frecuencia;
        //knlk
    }
}
