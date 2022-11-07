/*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/
package expoo01;

import Entidades.Fraccion;
import Servicios.SvFraccion;
import java.util.Scanner;


 //@author lauty
 
public class ExPOO01 {

    public static void main(String[] args) {
        SvFraccion f = new SvFraccion();
        Fraccion f1 = f.operar();
        int op;
        do {
        System.out.println("Elija la opcion deseada ingresando el numero correspondiente");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        Scanner input = new Scanner(System.in);
        op = input.nextInt();
            switch (op) {
                case 1:
                    f.sumar(f1);
                    break;
                case 2:
                    f.restar(f1);
                    break;
                case 3:
                    f.multiplicar(f1);
                    break;
                case 4:
                    f.dividir(f1);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una nueva");
            }
        } while(op!=5);
    }
}
