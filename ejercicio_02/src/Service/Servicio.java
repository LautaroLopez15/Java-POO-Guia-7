//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).

package Service;


//@author Facundo Cruz
import Entidad.Circunferencia;
import java.util.Scanner;
public class Servicio {

    public Servicio() {
    }
    public void crearCircunferencia(Circunferencia O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        O1.setRadio(leer.nextDouble());
    }
    public double area(Circunferencia O1){
        return (Math.PI*Math.pow(O1.getRadio(), 2));
        // return pi*radio^2
    }
    public double perimetro(Circunferencia O1){
        return (2*Math.PI*O1.getRadio());
        // return 2*pi*radio
    }
}
