/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej09g7;

import Entidades.Matematica;
import Servicios.SvMate;
import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class EJ09G7 {


    public static void main(String[] args) {
        Matematica o1 = new Matematica();
        SvMate m1 = new SvMate();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        o1.setNum1(leer.nextDouble());
        System.out.println("Ingrese segundo numero");
        o1.setNum2(leer.nextDouble());
        System.out.println("El mayor es: "+m1.devolverMayor(o1));
        System.out.println("El resultado es: "+m1.calcularP(o1));
        System.out.println("La raiz es igual a: "+m1.calcularR(o1));
    }
    
}
