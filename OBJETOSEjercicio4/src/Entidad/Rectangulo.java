/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Rectangulo {
    private double base;
    private double altura;
    
    Scanner leer=new Scanner(System.in);
    

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        //Rectangulo R1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectangulo");
      
        base= leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        
        altura=leer.nextDouble();
        
    }
    
    public double calcularSuperficie(){
        
        //Superficie = base * altura / Perímetro = (base + altura) * 2.
        
      
        
        return base*altura;
        
    }
    
    public double calcularPerimetro(){
        
         
        
        return (base+altura)*2;
        
    }
    
    public void dibujar(){
        
        for (int i = 0; i < (int)altura; i++) {
            
            for (int j = 0; j < (int)base; j++) {
                if(i==0 || j==0 || i==(int)altura-1|| j==(int)base-1){
                    
                    System.out.print(" *");  
                }else{
                    System.out.print("  ");
                }
                    
            }
            System.out.println("");
        }
    }

}


