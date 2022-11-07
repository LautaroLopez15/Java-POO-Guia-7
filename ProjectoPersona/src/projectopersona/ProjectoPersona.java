
package projectopersona;

import Servicios.PersonaService;
import projectopersona.Entidades.Persona;


public class ProjectoPersona {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        
        p1.setNombre("Joaquin");
        p1.setEdad(20);
        p1.setDNI(44037067);
        
        System.out.println("Nombre " + p1.getNombre());
        System.out.println("Edad " + p1.getEdad());
        System.out.println("DNI " + p1.getDNI());
        
        PersonaService ps = new PersonaService();
        Persona p2 = ps.nuevaPersona();
        System.out.println(p2.toString());
    }
    
}
