/*• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class SvCafetera {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera c1) {
        c1.setCantAc(c1.getCapMax());
        System.out.println("Se lleno la cafetera");
    }

    public void servirTaza(Cafetera c1) {
        System.out.println("Cantidad de cafe actual " + c1.getCantAc()+"ml");
        System.out.println("Elija tamaño de taza");
        System.out.println("1.Chica 100ml");
        System.out.println("2.Mediana 200ml");
        System.out.println("3.Grande 300ml");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                if (c1.getCantAc() - 100 < 0) {
                    System.out.println("Cantidad insuficiente para llenar la taza, se serviran " + c1.getCantAc());
                } else {
                    c1.setCantAc(c1.getCantAc() - 100);
                    System.out.println("Taza servida");
                }
                break;
            case 2:
                if (c1.getCantAc() - 200 < 0) {
                    System.out.println("Cantidad insuficiente para llenar la taza, se serviran " + c1.getCantAc());
                } else {
                    c1.setCantAc(c1.getCantAc() - 200);
                    System.out.println("Taza servida");
                }
                break;
            case 3:
                if (c1.getCantAc() - 300 < 0) {
                    System.out.println("Cantidad insuficiente para llenar la taza, se serviran " + c1.getCantAc());
                } else {
                    c1.setCantAc(c1.getCantAc() - 300);
                    System.out.println("Taza servida");
                }
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantAc(0);
        System.out.println("Se vacio la cafetera");
    }
    
    public void agregarCafe(Cafetera c1){
        System.out.println("Cuanto cafe desea agregar?");
        int cafe = leer.nextInt();
        if (c1.getCantAc()+cafe>c1.getCapMax()) {
            System.out.println("Demasiado cafe, se llenara la cafetera con: "+(c1.getCapMax()-c1.getCantAc()));
        }else{
            c1.setCantAc(c1.getCantAc()+cafe);
            System.out.println("Se agrego el cafe a la cafetera");
        }
    }
    
}
