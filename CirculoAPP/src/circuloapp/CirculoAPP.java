/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi ∗ radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro= 2 ∗ pi ∗ radio).
 */
package circuloapp;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CirculoAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia(0);
        
        System.out.println("Ingrese radio del circulo");
        double radio = c1.crearCircunferencia(leer.nextDouble());
        c1.setRadio(radio);
        System.out.print("El area es igual a: ");
        System.out.println(c1.area(radio));
        System.out.print("El perimetro es igual a: ");
        System.out.println(c1.perimetro(radio));
    }
    
}
