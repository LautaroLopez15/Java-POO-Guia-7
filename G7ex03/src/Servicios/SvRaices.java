/*
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package Servicios;

import Entidades.Raices;

/**
 *
 * @author lauty
 */
public class SvRaices {

    

    public double getDiscriminante(Raices r1) {
        return Math.pow(r1.getB(), 2.0) - 4.0 * r1.getA() * r1.getC();
    }

    public boolean tieneRaices(Raices r1) {
        SvRaices sv = new SvRaices();
        return sv.getDiscriminante(r1) > 0;
    }

    public boolean tieneRaiz(Raices r1) {
        SvRaices sv = new SvRaices();
        return sv.getDiscriminante(r1) == 0;

    }
    
    public void obtenerRaices(Raices r1){
        SvRaices sv = new SvRaices();
        if (sv.tieneRaices(r1)) {
            System.out.println("Las posibles soluciones son: ");
            System.out.println((-r1.getB()+Math.sqrt(Math.pow(r1.getB(), 2.0) - 4.0 * r1.getA() * r1.getC()))/(2.0*r1.getA()));
            System.out.println((-r1.getB()-Math.sqrt(Math.pow(r1.getB(), 2.0) - 4.0 * r1.getA() * r1.getC()))/(2.0*r1.getA()));
        }
    }
    
    public void obtenerRaiz(Raices r1){
        SvRaices sv = new SvRaices();
        if (sv.tieneRaiz(r1)) {
            System.out.println("La solucion es: ");
            System.out.println((-r1.getB()+Math.sqrt(Math.pow(r1.getB(), 2.0) - 4.0 * r1.getA() * r1.getC()))/(2.0*r1.getA()));
        }
    }
    
    public void calcular(Raices r1){
        SvRaices sv = new SvRaices();
        sv.obtenerRaices(r1);
        sv.obtenerRaiz(r1);
        if(sv.tieneRaices(r1)==false && sv.tieneRaiz(r1)==false){
            System.out.println("No existe solucion");
        }
    }
}