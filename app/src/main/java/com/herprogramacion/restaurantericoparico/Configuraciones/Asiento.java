package com.herprogramacion.restaurantericoparico.Configuraciones;

/**
 * Created by Miquel Ferriol Galmé on 12/03/2016.
 */
public class Asiento extends Peticion{
    private double posX,posY, incA;

    public Asiento() {
    }

    public Asiento(int id) {
        super(id);
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getIncA() {
        return incA;
    }

    public void setIncA(double incA) {
        this.incA = incA;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}
