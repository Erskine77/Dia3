package org.efrainperalta.sistema;

import java.util.ArrayList;
import java.util.List;
import org.efrainperalta.bean.FiguraGeometrica;
import org.efrainperalta.bean.Circulo;
import org.efrainperalta.bean.Triangulo;
import org.efrainperalta.bean.Cuadrado;

public class Principal {

    public static void main(String args[]) {
        Circulo miCirculo = new Circulo();
        miCirculo.setRadio(5);
        FiguraGeometrica miTriangulo = new Triangulo();
        miTriangulo.setAlto(200);
        miTriangulo.setAncho(50);
        FiguraGeometrica miCuadrado = new Cuadrado();
        miCuadrado.setAlto(4);
        miCuadrado.setAncho(4);
        List<FiguraGeometrica> lista = new ArrayList<FiguraGeometrica>();
        lista.add(miCirculo);
        lista.add(miTriangulo);
        lista.add(miCuadrado);
        for (FiguraGeometrica elemento : lista){
            if(elemento instanceof Triangulo){
                System.out.println("Triangulo Area: " +elemento.calcularArea());
            }else if(elemento instanceof Cuadrado){
                System.out.println("Cuadrado Area: " +elemento.calcularArea());
            }else if(elemento instanceof Circulo){
            System.out.println("Circulo Area: " +elemento.calcularArea());
            }
        }
    }
    
    //public static void main(String arg[]){
    //    byte nota = 127;
    //    short valor = 32767;
    //    System.out.println("PI: " + Math.PI);
    //    System.out.println("Resultado 2 8 = " + Math.pow(2, 8));
    //}
}
