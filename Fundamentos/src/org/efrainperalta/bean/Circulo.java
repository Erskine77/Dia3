package org.efrainperalta.bean;
public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public Circulo(){
        super();
    }

    public Circulo(double radio, int ancho, int alto) {
        super(ancho, alto);
        this.radio = radio;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }
}
