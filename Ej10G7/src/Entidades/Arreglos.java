/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Entidades;

import java.util.Arrays;

/**
 *
 * @author lauty
 */
public class Arreglos {

    private double vectorA[], vectorB[];

    public Arreglos() {
        this.vectorA = new double[50];
        this.vectorB = new double[20];
    }

    public Arreglos(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    public void agregar(double[] vectorA) {

        for (int i = 0; i < 50; i++) {
            double num = Math.random() * 10;
            vectorA[i] = Math.round(num * 100.0) / 100.0;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println(" ");
    }

    public void ordenar(double[] vectorA, double[] vectorB) {
        Arrays.sort(vectorA);
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + vectorA[i] + "]");
            if (i < 10) {
                vectorB[i] = vectorA[i];
            } else if (i >= 10 && i < 20) {
                Arrays.fill(vectorB, i, i + 1, 0.5);
            }
        }
        System.out.println(" ");
        System.out.println("B");
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
    }

}
