/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Entidad;

/**
 *
 * @author lorena
 */
public class circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;

    public circunferencia() {
    }

    public circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double calcularArea (double radio){
        
        area=(Math.PI)*Math.pow(radio,2);
        
        return area;
        //Area = π ∗ radio2
        
    }
    
    public double calcularPerimetro (double radio){
        
        perimetro=2*(Math.PI)*radio;
        return perimetro;
        //2 ∗ π ∗ radio
        
    }

    @Override
    public String toString() {
        return "Los datos de la circunferencia son: \n" + "radio=" + radio + "\n"+ "area=" + area +"\n"+ "perimetro=" + perimetro;
    }
    
  
    
}


/*

package Entidad;

/**
 *
 * @author DanielPalma

public class Circunferencia {
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    public double calculoArea(double radio){
        
        double area = (Math.PI)*Math.pow(radio,2);
        
        return area;
                     
    }
    
    public double calculoPerimetro(double radio){
        
        double perimetro = 2*(Math.PI)*radio;
        
        return perimetro;             
    }

    @Override
    public String toString() {
        return "Datos de Circunferencia: \n" + "radio=" + radio + "\n" + "area=" + area + "\n" + "perimetro=" + perimetro;
    }

  
}

*/