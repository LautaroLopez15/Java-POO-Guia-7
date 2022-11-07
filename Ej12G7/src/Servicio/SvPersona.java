/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class SvPersona {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("Año de nacimiento");
        int anio = leer.nextInt()-1900;
        System.out.println("Mes");
        int mes = leer.nextInt()-1;
        System.out.println("Dia");
        int dia = leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        return new Persona(nombre, fecha);
    }
    
    public int calcularEdad(Persona p1){
        Date fActual = new Date();
        if (p1.getFecha().getMonth()<fActual.getMonth()) {
            return (fActual.getYear()-p1.getFecha().getYear());
        } else if (p1.getFecha().getMonth()==fActual.getMonth()) {
            if (p1.getFecha().getDate()<=fActual.getDate()) {
                return (fActual.getYear()-p1.getFecha().getYear());
            } else {
                return (fActual.getYear()-p1.getFecha().getYear()-1);
            }
        } else {
            return (fActual.getYear()-p1.getFecha().getYear()-1);
        }
    }
    
    public boolean menorQ(int edad, Persona p1){
        return edad < calcularEdad(p1);
    }
    
    public void mostrar(Persona p1){
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Fecha de nacimiento: "+p1.getFecha().toLocaleString());
        System.out.println("Edad: "+calcularEdad(p1));
    }
}
