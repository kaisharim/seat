package com.herprogramacion.restaurantericoparico.Configuraciones;

/**
 * Created by Miquel Ferriol Galmé on 12/03/2016.
 */
public class Espejos extends Peticion {
    double rightX, rightY, leftX, leftY;

    public Espejos(){
        super();
    }

    public Espejos(int id){
        super(id);
    }

    public double getRightX() {
        return rightX;
    }

    public void setRightX(double rightX) {
        this.rightX = rightX;
    }

    public double getRightY() {
        return rightY;
    }

    public void setRightY(double rightY) {
        this.rightY = rightY;
    }

    public double getLeftX() {
        return leftX;
    }

    public void setLeftX(double leftX) {
        this.leftX = leftX;
    }

    public double getLeftY() {
        return leftY;
    }

    public void setLeftY(double leftY) {
        this.leftY = leftY;
    }
}
