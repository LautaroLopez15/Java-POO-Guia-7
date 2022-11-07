/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Servicios;

// @author lauty
import Entidades.Fraccion;
import java.util.Scanner;

public class SvFraccion {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Fraccion operar() {
        System.out.println("Ingrese numerador y denominador de la primer fraccion");
        String[] strnum = input.nextLine().split("/");
        int n1 = Integer.parseInt(strnum[0]);
        int d1 = Integer.parseInt(strnum[1]);
        System.out.println("Ingrese numerador y denominador de la segunda fraccion");
        strnum = input.nextLine().split("/");
        int n2 = Integer.parseInt(strnum[0]);
        int d2 = Integer.parseInt(strnum[1]);
        return new Fraccion(n1, d1, n2, d2);
    }

    public void sumar(Fraccion f1) {
        if (f1.getD1() > f1.getD2()) {
            if (f1.getD1() % f1.getD2() == 0) {
                System.out.println("La suma es igual a: " + (f1.getN1() + (f1.getD1()/f1.getD2()*f1.getN2())) + "/" + f1.getD1());
            } else {
                int d = f1.getD1() * f1.getD2();
                System.out.println("La suma es igual a: " + ((d / f1.getD1() * f1.getN1()) + (d / f1.getD2() * f1.getN2())) + "/" + d);
            }
        } else if (f1.getD2()>f1.getD1()) {
            if (f1.getD2() % f1.getD1() == 0) {
                System.out.println("La suma es igual a: " + ((f1.getD2()/f1.getD1()*f1.getN1()) + f1.getN2()) + "/" + f1.getD2());
            } else {
                int d = f1.getD1() * f1.getD2();
                System.out.println("La suma es igual a: " + ((d / f1.getD1() * f1.getN1()) + (d / f1.getD2() * f1.getN2())) + "/" + d);
            }
        } else {
            System.out.println("La suma es igual a: "+ (f1.getN1()+f1.getN2())+"/"+f1.getD1());
        }
        System.out.println(" ");
    }
    
    public void restar(Fraccion f1){
        if (f1.getD1() > f1.getD2()) {
            if (f1.getD1() % f1.getD2() == 0) {
                System.out.println("La resta es igual a: " + (f1.getN1() - (f1.getD1()/f1.getD2()*f1.getN2())) + "/" + f1.getD1());
            } else {
                int d = f1.getD1() * f1.getD2();
                System.out.println("La resta es igual a: " + ((d / f1.getD1() * f1.getN1()) - (d / f1.getD2() * f1.getN2())) + "/" + d);
            }
        } else if (f1.getD2()>f1.getD1()) {
            if (f1.getD2() % f1.getD1() == 0) {
                System.out.println("La resta es igual a: " + ((f1.getD2()/f1.getD1()*f1.getN1()) - f1.getN2()) + "/" + f1.getD2());
            } else {
                int d = f1.getD1() * f1.getD2();
                System.out.println("La resta es igual a: " + ((d / f1.getD1() * f1.getN1()) - (d / f1.getD2() * f1.getN2())) + "/" + d);
            }
        } else {
            System.out.println("La resta es igual a: "+ (f1.getN1()-f1.getN2())+"/"+f1.getD1());
        }
        System.out.println(" ");
    }
    
    public void multiplicar(Fraccion f1){
        System.out.println("La multiplicacion es igual a: "+((f1.getN1()*f1.getN2())+"/"+(f1.getD1()*f1.getD2())));
        System.out.println(" ");
    }
    
    public void dividir(Fraccion f1){
        System.out.println("La division es igual a: "+(f1.getN1()*f1.getD2())+"/"+(f1.getD1()*f1.getN2()));
        System.out.println(" ");
    }
}