package org.efrainperalta.bean;
public class Cuadrado extends FiguraGeometrica{
    public double calcularArea(){
        return getAncho() * getAlto();
    }
}
