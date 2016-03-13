package com.herprogramacion.restaurantericoparico.Configuraciones;

import java.util.ArrayList;

/**
 * Created by Miquel Ferriol Galmé on 12/03/2016.
 */
public class Radios extends Peticion {

    public static ArrayList<Radio> freq;

    public Radios(){
        super();
        freq = new ArrayList<>();
    }

    public Radios(int id){
        super(id);
        freq = new ArrayList<>();
    }

    public void addFreq(Radio r){
        this.freq.add(r);
    }

    public ArrayList<Radio> getFreq(){
        return freq;
    }


}
