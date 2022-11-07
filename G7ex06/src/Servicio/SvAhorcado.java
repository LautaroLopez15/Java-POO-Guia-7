/*
 */
package Servicio;

import Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class SvAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado llenar() {
        System.out.println("Ingrese palabra para jugar");
        String frase = leer.nextLine();
        String aux[] = new String[frase.length()];
        String auxv[] = new String[frase.length()];
        String usadas = "";
        for (int i = 0; i < frase.length(); i++) {
            aux[i] = frase.substring(i, i + 1);
            if (i == 0) {
                auxv[i] = frase.substring(i, i + 1) + " ";
                usadas = frase.substring(i, i + 1) + " ";
            } else if (usadas.equalsIgnoreCase(frase.substring(i, i + 1) + " ")) {
                auxv[i] = frase.substring(i, i + 1) + " ";
            } else {
                if (frase.substring(i, i + 1).equals(" ")) {
                    auxv[i] = "  ";
                } else {
                    auxv[i] = "_ ";
                }           
            }
        }
        return new Ahorcado(aux, frase, usadas, auxv, 6);
    }
////////////////////////////////////////////////////////////////////////////////

    public void juego(Ahorcado a1) {
        SvAhorcado sv = new SvAhorcado();
        String test[] = new String[a1.getFrase().length()];
        for (int i = 0; i < a1.getFrase().length(); i++) {
            Arrays.fill(test, i, i + 1, a1.getVacio()[i]);
        }

        do {
            if (sv.completo(a1)==false) {
                sv.dibujos(a1);
                System.out.println("ʕ́• ᴥ •̀ʔっ Usted es un genio, fiera, maquina, bestia, el mejor del mundo");
                break;
            }
            sv.dibujos(a1);
            System.out.println("Ingrese una letra o arriesgue la palabra");
            System.out.println("Vidas " + a1.getVidas());
            String input = leer.nextLine();
            if (input.length() > 1) {
                if (sv.arriesgo(a1, input)) {
                    System.out.println("ʕ́• ᴥ •̀ʔっ Usted es un genio, fiera, maquina, bestia, el mejor del mundo");
                    break;
                } else {
                    System.out.println("(╥﹏╥) Horrible + ahorcado + skill issue ☠");
                    a1.setVidas(0);
                }
            } else {
                if (a1.getUsadas().contains(input)) {
                    System.out.println("Ya ingresaste esa letra");
                    a1.setVidas(a1.getVidas() - 1);
                } else {
                    int cont = 0;
                    for (int i = 0; i < a1.getFrase().length(); i++) {
                        if (input.equalsIgnoreCase(a1.getVpalabra()[i])) {
                            cont++;
                            test[i] = input + " ";
                            a1.setVacio(test);
                        }
                    }
                    if (cont == 0) {
                        a1.setVidas(a1.getVidas() - 1);
                    }
                    a1.setUsadas(a1.getUsadas().concat(input + " "));
                }

            }
            
        } while (a1.getVidas() > 0);
        if (a1.getVidas()==0) {
            sv.dibujos(a1);
            System.out.println("☠Horrible + ahorcado + skill issue☠");
        }

    }
////////////////////////////////////////////////////////////////////////////////

    public boolean arriesgo(Ahorcado a1, String input) {
        boolean flag = true;
        int i = 0;
        do {
            flag = input.substring(i, i + 1).equalsIgnoreCase(a1.getVpalabra()[i]);
            i++;
        } while (flag && i < input.length());
        return flag;
    }
////////////////////////////////////////////////////////////////////////////////    

    public void dibujos(Ahorcado a1) {
        switch (a1.getVidas()) {
            case 6: 
                System.out.println("    (•‿•)   ");
                break;
            case 5:
                System.out.println("    (¬‿¬)  ");
                System.out.println("      |   ");
                break;
            case 4:
                System.out.println("   ( ≖.≖)  ");
                System.out.println("      |   ");
                System.out.println("      |  ");  
                break;
            case 3:
                System.out.println("    (◑_◑)  ");
                System.out.println("      |   ");
                System.out.println("     /|\\  ");
                break;
            case 2:
                System.out.println("    (ㆆ_ㆆ)  ");
                System.out.println("      |   ");
                System.out.println("     /|\\  ");
                System.out.println("      |   ");
                break;
            case 1:
                System.out.println("   ⁀⊙﹏☉⁀  ");
                System.out.println("      |   ");
                System.out.println("     /|\\  ");
                System.out.println("      |   ");
                System.out.println("     / \\ ");
                break;
            case 0:
                System.out.println("   (╥﹏╥)  ");
                System.out.println("--------------");
                System.out.println("      |   ");
                System.out.println("     /|\\  ");
                System.out.println("      |   ");
                System.out.println("     / \\ ");
                break;
        }
        for (int i = 0; i < a1.getFrase().length(); i++) {
            System.out.print(a1.getVacio()[i]);
        }
        System.out.println(" ");

        System.out.println("Letras usadas " + a1.getUsadas());
    }
    
    public boolean completo(Ahorcado a1){
        int cont = 0;
        for (int i = 0; i < a1.getVacio().length; i++) {
            if (a1.getVacio()[i].contains("_ ")) {
                cont++;
            }
        }
        return (cont>0);
    }
}
