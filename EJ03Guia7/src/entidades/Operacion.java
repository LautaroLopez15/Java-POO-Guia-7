/*
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
package entidades;

import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class Operacion {
    private int num1,num2;
    Scanner leer = new Scanner(System.in);

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = leer.nextInt();
    }
    
    public int sumar(){
        return num1 + num2;
    }
    
    public int restar(){
        return num1 - num2;
    }
    
    public int multiplicar(){
        if ( num1 == 0 || num2 == 0){
            return 0;
        } else {
            return num1*num2;
        }
    }
    
    public double dividir(){
        if ( num1 == 0 || num2 == 0){
            return 0;
        } else {
            return (double)num1/(double)num2;
        }
    }
}
