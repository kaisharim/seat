package com.herprogramacion.restaurantericoparico.Configuraciones;

import java.util.ArrayList;

/**
 * Created by Miquel Ferriol Galmé on 12/03/2016.
 */
public class Radio extends Peticion {

    ArrayList<Double> freq;

    public Radio(){
        super();
        freq = new ArrayList<>();
    }

    public Radio(int id){
        super(id);
        freq = new ArrayList<>();
    }

    public void addFreq(double freq){
        this.freq.add(freq);
    }

    public ArrayList<Double> getFreq(){
        return freq;
    }


}
