/*
 */
package Entidades;


public class Ahorcado {
    private String vpalabra[];
    private String frase, usadas;
    private String vacio[];
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vpalabra, String frase, String usadas, String[] vacio, int vidas) {
        this.vpalabra = vpalabra;
        this.frase = frase;
        this.usadas = usadas;
        this.vacio = vacio;
        this.vidas = vidas;
    }

    public String[] getVpalabra() {
        return vpalabra;
    }

    public void setVpalabra(String[] vpalabra) {
        this.vpalabra = vpalabra;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getUsadas() {
        return usadas;
    }

    public void setUsadas(String usadas) {
        this.usadas = usadas;
    }

    public String[] getVacio() {
        return vacio;
    }

    public void setVacio(String[] vacio) {
        this.vacio = vacio;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    
}
