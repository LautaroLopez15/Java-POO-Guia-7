//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.

package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;


//@author Facundo Cruz
//@thief Lautaro Lopez

public class Servicio {

    public Servicio() {
    }
    public void crearRectangulo(Rectangulo O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        O1.setAltura(leer.nextInt());
        System.out.println("Ingrese la base");
        O1.setBase(leer.nextInt());
        
    }
    public int calcularSuperficie(Rectangulo O1){
        return(O1.getAltura()*O1.getBase());
    }
    public int calcularPerimetro(Rectangulo O1){
        return((O1.getAltura()+O1.getBase())*2);
        // return (A + B)*2
    }
//    public void dibujarRectangulo(Rectangulo O1){
//        for (int i = 0; i < O1.getAltura(); i++) {
//            for (int j = 0; j < O1.getBase(); j++) {
//                if(i==0||i==O1.getAltura()-1||j==0||j==O1.getBase()-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
    
   
    public void dibujarRectangulo(Rectangulo O1){
        for (int i = 0; i < O1.getAltura(); i++) {
            for (int j = 0; j < O1.getBase(); j++) {
                if (i==0 || i==O1.getAltura()-1 || j==0 || j==O1.getBase()-1){
                  System.out.print("* ");  
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }
    } 
}

