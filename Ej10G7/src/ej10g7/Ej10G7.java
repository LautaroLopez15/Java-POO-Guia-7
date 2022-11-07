/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej10g7;

import Entidades.Arreglos;


/**
 *
 * @author lauty
 */
public class Ej10G7 {

    public static void main(String[] args) {
        Arreglos v1 = new Arreglos();
        double[] vectorA = new double [50];
        double[] vectorB = new double [20];
        System.out.println("Agregados");
        v1.agregar(vectorA);
        System.out.println("Ordenados A");
        v1.ordenar(vectorA, vectorB);
    }
    
}
