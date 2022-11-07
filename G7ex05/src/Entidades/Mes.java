/*Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lauty
 */
public class Mes {
    private String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mesS;

    public Mes() {
    }

    public Mes(String mesS) {
        this.mesS = mesS;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesS() {
        return mesS;
    }

    public void setMesS(String mesS) {
        this.mesS = mesS;
    }
    
    public void adivinar(){
        Scanner leer = new Scanner(System.in);
        mesS = meses[(int) (Math.random()*12)];
        boolean flag=false;
        System.out.println(mesS);
        System.out.println("Trate de adivinar el mes");
        do {
            if (!leer.next().equalsIgnoreCase(mesS)) {
                System.out.println("Incorrecto intente de nuevo");
            } else {
                System.out.println("Ha acertado");
                flag = true;
            }
        } while (flag==false);
        
    }
}
