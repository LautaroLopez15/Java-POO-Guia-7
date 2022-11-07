/*
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class Puntos {
    private int x1,x2,y1,y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        System.out.println("Ingrese coordenadas puntoA");
        x1 = leer.nextInt();
        y1 = leer.nextInt();
        System.out.println("Ingrese coordenada puntoB");
        x2 = leer.nextInt();
        y2 = leer.nextInt();
        
        return new Puntos(x1, x2, y1, y2);
    }
    
    public void calcular(){
        System.out.println("La distancia entre los dos puntos es: "+Math.sqrt((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2))));
    }
    
    
    
    
    
}
