/*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class SvCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarV(Cadena f1){
        int cont = 0;
        for (int i = 0; i < f1.getLongitud(); i++) {
            char letra = f1.getFrase().charAt(i);
            if ("aeiou".contains(String.valueOf(letra).toLowerCase())) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales es: "+cont);
    }
    
    public void invertirF(Cadena f1){
        for (int i = f1.getLongitud()-1; i>=0; i--) {
            System.out.print(f1.getFrase().charAt(i));
        }
        System.out.println(" ");
    }
    
    public void vecesR(Cadena f1){
        int cont = 0;
        System.out.println("Ingrese una letra a buscar");
        String comp = leer.next().toLowerCase();
        for (int i = 0; i < f1.getLongitud(); i++) {
            char letra = f1.getFrase().charAt(i);
            if (comp.contains(String.valueOf(letra).toLowerCase())) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces que se repite es: "+cont);   
    }
    
    public void compL(Cadena f1){
        System.out.println("Ingrese nueva frase para comparar longitud");
        String nueva = leer.next();
        if (f1.getLongitud()>nueva.length()) {
            System.out.println("La primer frase es mas larga");
        }else if (f1.getLongitud()==nueva.length()) {
            System.out.println("Las frases miden igual");
        }else {
            System.out.println("La frase nueva es mas larga");
        }   
    }
    
    public void unirF(Cadena f1){
        System.out.println("Ingrese nueva frase para concatenar");
        String nueva = leer.next();
        System.out.println(f1.getFrase().concat(nueva));  
    }
    
    public void reemplazar(Cadena f1){
        System.out.println("Ingrese letra con la que reemplazar");
        f1.setFrase(f1.getFrase().replace("A", "a"));
        f1.setFrase(f1.getFrase().replace("a", leer.next()));
        System.out.println(f1.getFrase());
    }
    
    public boolean contiene(Cadena f1){
        System.out.println("Ingrese una letra a buscar en la frase");
        return f1.getFrase().toLowerCase().contains(leer.next().toLowerCase());
    }
}
