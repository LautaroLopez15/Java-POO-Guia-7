
package ej04guia7;

import Entidades.Rectangulo;
import Servicios.ServicioRectangulo;


public class Ej04Guia7 {

    public static void main(String[] args) {
        ServicioRectangulo rr = new ServicioRectangulo();
        Rectangulo r1 = new Rectangulo();
        rr.crearRect(r1);
        System.out.println("El perimetro es: "+rr.calcularP(r1));
        System.out.println("La superficie es: "+rr.calcularS(r1));
        rr.dibujar(r1);
    }
    
}
