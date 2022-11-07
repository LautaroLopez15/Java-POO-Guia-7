
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;


public class ServicioRectangulo {
    
    public Rectangulo crearRect (Rectangulo r1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura");
        r1.setAltura(leer.nextInt());
        System.out.println("Ingrese base");
        r1.setBase(leer.nextInt());
        return r1;
    }
    
    public int calcularS(Rectangulo r1){
        return r1.getAltura() * r1.getBase();
    }
    
    public int calcularP(Rectangulo r1){
        return (r1.getAltura() + r1.getBase()) * 2;
    }
    
    public void dibujar(Rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i==0 || j==0 || i==(r1.getAltura()-1) || j==(r1.getBase()-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
