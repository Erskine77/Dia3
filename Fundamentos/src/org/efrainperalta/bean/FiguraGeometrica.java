package org.efrainperalta.bean;
public abstract class FiguraGeometrica {
    private int ancho;
    private int alto;
    
    //Constructor null
    public FiguraGeometrica (){
        
    }
    
    //public FiguraGeometrica(int ancho){
    //    this.ancho = ancho;
    //}

    public FiguraGeometrica(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
        
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public abstract double calcularArea();
    
}
