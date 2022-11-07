//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).

package ejercicio_02;

//@author Facundo Cruz
import Entidad.Circunferencia;
import Service.Servicio;
public class Ejercicio_02 {

    public static void main(String[] args) {
       Servicio servicio = new Servicio(); // Instanciamos libreria con acciones.
       Circunferencia O1 = new Circunferencia(0);
       servicio.crearCircunferencia(O1);
        System.out.println("El area es: "+servicio.area(O1));
        System.out.println("El perímetro es: "+servicio.perimetro(O1));
    }

}
