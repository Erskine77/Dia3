package org.efrainperalta.bean;
public class Triangulo extends FiguraGeometrica{

    public Triangulo() {
    }

    public Triangulo(int ancho, int alto) {
        super(ancho, alto);
    }
    
    @Override
    public double calcularArea(){
        return (getAncho() * getAlto())/2;
    }
}
