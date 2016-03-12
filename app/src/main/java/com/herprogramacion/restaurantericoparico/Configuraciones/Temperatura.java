package com.herprogramacion.restaurantericoparico.Configuraciones;

/**
 * Created by Miquel Ferriol Galmé on 12/03/2016.
 */
public class Temperatura extends Peticion{
    public double temperatura;

    public Temperatura(){
        super();
    }

    public Temperatura(int id){
        super(id);
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

}
