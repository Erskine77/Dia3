package org.erskineespaderos.iu;

import org.efrainperalta.bean.FiguraGeometrica;
import org.erskineespaderos.interfaces.Calculadora;

public class Matematica implements Calculadora{

    @Override
    public void mostrarResultado(FiguraGeometrica figura) {
        System.out.println("Resultado: " + figura.calcularArea());
    }
    
}
