/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ej07g7;

import Entidades.Persona;
import Servicios.SvPersona;


public class Ej07G7 {


    public static void main(String[] args) {
        int cont=0,cont1=0,contb=0,conti=0,conta=0;
        SvPersona pp = new SvPersona();
        do {
          Persona p1 = pp.crearPersona();
          cont++;
        if (pp.esMayorDeEdad(p1)==true) {
            cont1++;
        }
        if (pp.calcularIMC(p1)==-1) {
            contb++;
        } else if (pp.calcularIMC(p1)==0) {
            conti++;
        } else if (pp.calcularIMC(p1)==1) {
            conta++;
        }  
        } while (cont<4); 
        System.out.println("El porcentaje de personas mayores de edad es: "+(cont1*100/4)+"%");
        System.out.println("El porcentaje de personas menores de edad es: "+(4-cont1)*100/4);
        System.out.println("Porcentaje de personas segun peso ");
        System.out.println("Peso ideal: "+(conti*100/4)+"%");
        System.out.println("Peso bajo: "+(contb*100/4)+"%");
        System.out.println("Peso alto: "+(conta*100/4)+"%");
    }
    
}
