

package ejercicio_04;

//@author Facundo Cruz

import Entidad.Rectangulo;
import Servicio.Servicio;


public class Ejercicio_04 {

    public static void main(String[] args) {
        Servicio accion = new Servicio();
        Rectangulo O1 = new Rectangulo();
        accion.crearRectangulo(O1);
        System.out.println("El area es: "+accion.calcularSuperficie(O1));
        System.out.println("El perímetro es: "+accion.calcularPerimetro(O1));
        accion.dibujarRectangulo(O1);
    }

}
