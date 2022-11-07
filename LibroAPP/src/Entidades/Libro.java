
package Entidades;

import java.util.Scanner;

public class Libro {
    public int ISBN;
    public int npaginas;
    public String autor;
    public String titulo;
    
    
    public Libro() {
    }

    public Libro(int ISBN, int npaginas, String autor, String titulo) {
        this.ISBN = ISBN;
        this.npaginas = npaginas;
        this.autor = autor;
        this.titulo = titulo;
    }
   
        public void llenar (Libro L1){
        Scanner leer = new Scanner(System.in);    
        System.out.println("Ingrese numero isbn");
        L1.ISBN = leer.nextInt();
        System.out.println("Ingrese autor");
        L1.autor = leer.next();
        System.out.println("Ingrese numero de paginas");
        L1.npaginas = leer.nextInt();
        System.out.println("Ingrese titulo");
        L1.titulo = leer.next();
    }
        public void informar(Libro L1){
        System.out.println("ISBN "+L1.ISBN+", autor "+L1.autor+", N.paginas "+L1.npaginas+", Titulo "+L1.titulo);
    }
}
