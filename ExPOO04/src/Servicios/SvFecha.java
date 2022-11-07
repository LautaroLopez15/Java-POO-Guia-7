/*
Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto
 */
package Servicios;

// @author lauty
import Entidades.Fecha;
import java.util.Scanner;

public class SvFecha {

    Scanner input = new Scanner(System.in);
    String[] meses = new String[]{"Diciembre", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};
    int[] cant = new int[]{31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Fecha ingreso() {

        int ano = 1900, mes = 1, dia = 1;

        System.out.println("Ingrese el año");
        ano = input.nextInt();
        if (ano > 2022 || ano < 1900) {
            ano = 1900;
        }

        System.out.println("Ingrese el mes");
        mes = input.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Ingrese mes nuevamente");
            mes = input.nextInt();
        }

        System.out.println("Ingrese el dia");
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dia = input.nextInt();
            while (dia < 1 || dia > 31) {
                System.out.println("Ingrese un dia correcto(1-31)");
                dia = input.nextInt();
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dia = input.nextInt();
            while (dia < 1 || dia > 30) {
                System.out.println("Ingrese un dia correcto(1-30)");
                dia = input.nextInt();
            }
        } else {
            if (bisiesto(ano)) {
                dia = input.nextInt();
                while (dia < 1 || dia > 29) {
                    System.out.println("Ingrese un dia correcto(1-29)");
                    dia = input.nextInt();
                }
            } else {
                dia = input.nextInt();
                while (dia < 1 || dia > 28) {
                    System.out.println("Ingrese un dia correcto(1-28)");
                    dia = input.nextInt();
                }

            }
        }
        return new Fecha(ano, mes, dia);
    }

    public boolean bisiesto(int ano) {
        if (((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 100 == 0) && (ano % 400 == 0))) {
            cant[2]=29;
        }
        return ((ano % 4 == 0) && (ano % 100 != 0)) || ((ano % 100 == 0) && (ano % 400 == 0));
    }

    public void mostrar(Fecha f1) {
        System.out.println("Usted ingreso la fecha: " + f1.getDia() + "/" + f1.getMes() + "/" + f1.getAno());
        System.out.println("Mes ingresado " + meses[f1.getMes()] + " tiene " + cant[f1.getMes()]);
        

        System.out.println("\nFecha anterior");
        if (f1.getDia() == 1) {

            if (f1.getMes() == 1) {
                System.out.println("Año: " + (f1.getAno() - 1));
                System.out.println("Mes: Diciembre");
                System.out.println("Dia: " + 31);
            } else {
                System.out.println("Año: " + f1.getAno());
                System.out.println("Mes: " + meses[f1.getMes() - 1]);
                if ((f1.getMes() - 1) == 2) {
                    if (bisiesto(f1.getAno())) {
                        System.out.println("Dia: " + 29);
                    } else {
                        System.out.println("Dia: " + 28);
                    }
                } else {
                    System.out.println("Dia: " + cant[f1.getMes() - 1]);
                }

            }
        } else {
            System.out.println("Año: " + f1.getAno());
            System.out.println("Mes: " + meses[f1.getMes()]);
            System.out.println("Dia: " + (f1.getDia() - 1));
        }

        System.out.println("\nFecha posterior");
        if (cant[f1.getMes()]==f1.getDia()) {

            if (f1.getMes() == 12) {
                System.out.println("Año: " + (f1.getAno() + 1));
                System.out.println("Mes: Enero");
                System.out.println("Dia: " + 01);
            } else {
                System.out.println("Año: " + f1.getAno());
                System.out.println("Mes: " + meses[f1.getMes() + 1]);
                System.out.println("Dia: "+ 01);
            }
        } else {
            System.out.println("Año: " + f1.getAno());
            System.out.println("Mes: " + meses[f1.getMes()]);
            System.out.println("Dia: " + (f1.getDia() + 1));
        }
    }
}