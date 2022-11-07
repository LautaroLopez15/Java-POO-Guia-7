/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package ej03guia7;

import entidades.Operacion;

/**
 *
 * @author lauty
 */
public class EJ03Guia7 {


    public static void main(String[] args) {
        Operacion o1 = new Operacion();
        o1.crearOperacion();
        System.out.println("La suma es igual a: "+o1.sumar());
        System.out.println("La resta es igual a: "+o1.restar());
        if (o1.multiplicar()==0) {
            System.out.println("Error 404");
        }else{
            System.out.println("La multiplicacion es igual a: "+o1.multiplicar());
        }
        if (o1.dividir()==0) {
            System.out.println("Error 405");
        }else{
            System.out.println("La division es igual a: "+o1.dividir());
        }
    }
    
}
