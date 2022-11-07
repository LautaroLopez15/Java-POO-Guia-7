
package Entidades;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double crearCircunferencia(double radio){
        this.radio = radio;
        return radio;
    }
    
    public double area(double radio){
        return (Math.PI)*(radio*radio);
        
    }
    
    public double perimetro(double radio){
        return 2*(Math.PI)*radio;
        
    }

}

