
package Servicios;

import java.util.Scanner;
import projectopersona.Entidades.Persona;

public class PersonaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public Persona nuevaPersona() {
    
        Persona n1Persona = new Persona();
        
        System.out.println("Ingrese nombre nueva persona");
        n1Persona.setNombre(leer.next());
        System.out.println("Ingrese edad nueva");
        n1Persona.setEdad(leer.nextInt());
        System.out.println("Ingrese nuevo DNI");
        n1Persona.setDNI(leer.nextInt());
        
        return n1Persona;
}
    
}
