/*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;

/**
 *
 * @author lauty
 */
public class SvMate {

    public double devolverMayor(Matematica o1) {
        return Math.max(o1.getNum1(), o1.getNum2());
    }

    public double calcularP(Matematica o1) {
        o1.setNum1(Math.round(o1.getNum1()));
        o1.setNum2(Math.round(o1.getNum2()));
        System.out.println(o1.getNum1());
        System.out.println(o1.getNum2());
        return Math.pow(Math.max(o1.getNum1(), o1.getNum2()), Math.min(o1.getNum1(), o1.getNum2()));
    }

    public double calcularR(Matematica o1) {
        return Math.sqrt(Math.abs(Math.min(o1.getNum1(), o1.getNum2())));
    }
}
