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

package Servicios;

// @author lauty

import Entidades.Sopa;
import java.util.Scanner;

 
public class SvSopa {
     Scanner input = new Scanner(System.in);
    public void llenar(Sopa s1){
        String palabras[] = {"perro","libro","autos","papel","gatos"};
        String matrix[][]=new String [10][10];
        s1.setSopa(matrix);
        
        int aleatorio[] = new int[5];
        
        aleatorio[0] = (int) (Math.random()*10);
        for (int i = 1; i < aleatorio.length; i++) {
            aleatorio[i] = (int)(Math.random()*10);
            for (int j = 0; j < i; j++) {
                if (aleatorio[i]==aleatorio[j]) {
                 i--;   
                }
            }
        }
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = String.valueOf((char)((Math.random()*25)+97));
            }
        }
        
        for (int i = 0; i < 5; i++) {
            int columna = (int)(Math.random()*5);
            for (int j = 0; j < 5; j++) {
                matrix[aleatorio[i]][columna] = palabras[i].substring(j, j+1);
                columna++;
            }
        }
        s1.setSopa(matrix);
        
    }
    
    public int[] buscar (Sopa s1){
        System.out.println("Ingrese una palabra a buscar");
        s1.setPalabraB(input.next());
        int fila = -1,col=-1;
        boolean val = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s1.getPalabraB().substring(0, 1).equalsIgnoreCase(s1.getSopa()[i][j])&&j<=5) {
                    if (s1.getPalabraB().substring(1, 2).equalsIgnoreCase(s1.getSopa()[i][j+1])) {
                        if (s1.getPalabraB().substring(2, 3).equalsIgnoreCase(s1.getSopa()[i][j+2])) {
                            if (s1.getPalabraB().substring(3, 4).equalsIgnoreCase(s1.getSopa()[i][j+3])) {
                                if (s1.getPalabraB().substring(4, 5).equalsIgnoreCase(s1.getSopa()[i][j+4])) {
                                    val=true;
                                    System.out.println("La palabra esta en las coordenadas: ["+i+"] ["+j+"]");
                                    fila = i;
                                    col = j;
                                }
                            }
                        }
                        
                    }
 
                }
            }
        }
        
        if (val==false) {
            System.out.println("La palabra no esta en la matriz");
        } 
        
        int[] vect = {fila,col};
        
        return vect;
    }
    
    public void cambiar(Sopa s1){
        String matrix[][] = s1.getSopa();
        int [] vect = buscar(s1);
        int fila = vect[0];
        int col = vect[1];
        if (fila==-1) {
            System.out.println("No se puede reemplazar");
         
        } else {
          System.out.println("Ingrese la palabra con la que quiere reemplazar");
          String rem = input.next(); 
          
          int aux = 0;
            for (int k = col; k < col+rem.length(); k++) {
                matrix[fila][k] = rem.substring(aux, aux+1);
                aux++;
            }
            s1.setSopa(matrix);
            imprimir(s1);
        }
        
        
    }
    
    public void imprimir(Sopa s1){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(s1.getSopa()[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
