/*
Métodos para desarrollar:
● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
 */
package Servicio;

// @author lauty
import Entidades.Pass;
import java.util.Scanner;

public class SvPass {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void crearPass(Pass p1) {
        System.out.println("Ingrese una contraseña");
        String ps = input.next();
        while (ps.length() != 10) {
            System.out.println("Contraseña no valida");
            ps = input.next();
        }
        p1.setPass(ps);
    }

    public void analizar(Pass p1) {
        int contA = 0, contZ = 0;
        for (int i = 0; i < 10; i++) {
            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                contZ++;
            }
            if (p1.getPass().substring(i, i + 1).equalsIgnoreCase("a")) {
                contA++;
            }
        }
        if (contZ >= 1 && contA < 2) {
            System.out.println("Su contraseña es nivel medio");
        } else if (contZ >= 1 && contA >= 2) {
            System.out.println("Su contraseña es nivel alto");
        } else {
            System.out.println("Su contraseña es nivel bajo");
        }
    }

    public void modificar(Pass p1) {
        System.out.println("Ingrese la contraseña");
        String pas = input.next();
        int op = 0;
        do {
            if (pas.equalsIgnoreCase(p1.getPass())) {
                System.out.println("Menu");
                System.out.println("1.Modificar nombre");
                System.out.println("2.Modificar dni");
                System.out.println("3.Modificar contraseña");
                System.out.println("4.Mostrar nivel contraseña");
                System.out.println("5.Salir");
                op = input.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Ingrese la contraseña");
                        pas = input.next();
                        if (pas.equalsIgnoreCase(p1.getPass())) {
                            System.out.println("Ingrese un nuevo nombre");
                            p1.setNombre(input.nextLine());
                            break;
                        } else {
                            System.out.println("Incorrecta");
                            break;
                        }

                    case 2:
                        System.out.println("Ingrese la contraseña");
                        pas = input.next();
                        if (pas.equalsIgnoreCase(p1.getPass())) {
                            System.out.println("Ingrese un nuevo dni");
                            p1.setDni(input.nextInt());
                            break;
                        } else {
                            System.out.println("Incorrecta");
                            break;
                        }
                    case 3:
                        System.out.println("Ingrese la contraseña");
                        pas = input.next();
                        if (pas.equalsIgnoreCase(p1.getPass())) {
                            System.out.println("Ingrese una nueva contraseña");
                            String nueva = input.next();
                            if (nueva.equalsIgnoreCase(p1.getPass())) {
                                System.out.println("La contraseña no puede ser la misma que la anterior");
                            } else {
                                if (nueva.length() == 10) {
                                    p1.setPass(nueva);
                                } else {
                                    System.out.println("Contraseña invalida");
                                    break;
                                }
                            }
                            break;
                        } else {
                            System.out.println("Incorrecta");
                            break;
                        }
                    case 4:
                        analizar(p1);
                        break;
                    case 5:
                        System.out.println("Chau");
                        break;
                    default:
                        System.out.println("Opcion no valida, ingrese una nueva");
                }

            } else {
                while (!pas.equalsIgnoreCase(p1.getPass())) {
                    System.out.println("Contraseña incorrecta");
                    pas = input.nextLine();
                }
            }
        } while (op != 5);

    }
}
