/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
 */
package Entidades;

/**
 *
 * @author lauty
 */
public class Cafetera {
    private int capMax=1000,cantAc;

    public Cafetera(int capMax, int cantAc) {
        this.capMax = capMax;
        this.cantAc = cantAc;
    }

    public Cafetera() {
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCantAc() {
        return cantAc;
    }

    public void setCantAc(int cantAc) {
        this.cantAc = cantAc;
    }
    
    
}
