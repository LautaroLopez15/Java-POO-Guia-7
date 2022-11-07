/*
Crear una clase Sopa de letras que contenga un atributo matriz, y otro palabra a encontrar.
Llenar una matriz de 10x10 con palabras de 5 caracteres (todas de forma horizontal, en orden)
inicializándola por defecto con “palabras preestablecidas”.
Crear métodos:
● Que el usuario ingrese una palabra y la busque en la matriz. Deberá retornar en que
posición de la matriz inicia la palabra.
● Imprimir la sopa de letras en pantalla
● Que el usuario pueda reemplazar una palabra especifica de la matriz ya pre -cargada (Es
decir, por ejemplo, que si en posición 0.0 estaba perro, cambiarla a polo). Para realizar esta
gestión, el método recibirá la palabra a buscar y a reemplazar sus datos
*/

package Entidades;

// @author lauty
 
public class Sopa {
    
    private String sopa[][]=new String [10][10];
    private String palabraB;

    public Sopa() {
        
    }

    public Sopa(String[][] sopa, String palabraB) {
        this.sopa = sopa;
        this.palabraB = palabraB;
    }

    public String[][] getSopa() {
        return sopa;
    }

    public void setSopa(String[][] sopa) {
        this.sopa = sopa;
    }

    public String getPalabraB() {
        return palabraB;
    }

    public void setPalabraB(String palabraB) {
        this.palabraB = palabraB;
    }
    
    
}
