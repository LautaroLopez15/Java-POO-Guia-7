/* Juego ahorcado
 */
package g7ex06;

import Entidades.Ahorcado;
import Servicio.SvAhorcado;


public class G7ex06 {

    
    public static void main(String[] args) {
        SvAhorcado sv = new SvAhorcado();
        Ahorcado a1 = sv.llenar();
        sv.juego(a1);

    }
    
}
