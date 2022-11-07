/*
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class SvPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese peso en kg");
        double peso = leer.nextDouble();
        System.out.println("Ingrese altura en m");
        double altura = leer.nextDouble();
        System.out.println("Ingrese sexo (M,H,O)");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O")) {
            System.out.println("Opcion incorrecta, ingrese una valida");
            sexo = leer.next();
        }
        return new Persona(nombre, sexo, edad, peso, altura);
    }
    
    public double calcularIMC(Persona p1){
        if (p1.getPeso()*(Math.pow(p1.getAltura(), 2))<20) {
            return -1;
        } else if(p1.getPeso()*(Math.pow(p1.getAltura(), 2))>=20 && p1.getPeso()*(Math.pow(p1.getAltura(), 2))<+25){
            return 1;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad (Persona p1){
        return (p1.getEdad()>=18);
    }
}
