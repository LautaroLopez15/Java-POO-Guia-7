/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej11g7;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class Ej11G7 {

    
    public static void main(String[] args) {
        int anio,mes,dia;
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese año");
        // constructor inicializa el año sumandole 1900
        anio = leer.nextInt()-1900;
        System.out.println("Ingrese mes");
        mes = leer.nextInt()-1;
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        Date fecha = new Date(anio,mes,dia);
        Date fActual = new Date();
        System.out.println(fecha.toString());
        System.out.println("La cantidad de años entre la fecha actual y la ingresadad es: "+(fActual.getYear()-fecha.getYear()));
        
    }
    
}
