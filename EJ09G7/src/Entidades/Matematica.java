/*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set.
 */
package Entidades;

/**
 *
 * @author lauty
 */
public class Matematica {
    private static double num1,num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        Matematica.num1 = num1;
        Matematica.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        Matematica.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        Matematica.num2 = num2;
    }
    
    
    
}
