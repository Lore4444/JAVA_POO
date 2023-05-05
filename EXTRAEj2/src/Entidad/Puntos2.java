/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Entidad;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Puntos2 {
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    

    public void crearPuntos(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de x1");
        x1=leer.nextDouble();
        System.out.println("Ingrese el valor de x2");
        x2=leer.nextDouble();
        System.out.println("Ingrese el valor de y1");
        y1=leer.nextDouble();
        System.out.println("Ingrese el valor de y2");
        y1=leer.nextDouble();
        
    } 

    public void metodoCalcular(){
//        double resta=(x2-x1);
//        double resta2=(y2-y1);
//        double calcular=Math.sqrt((Math.pow(resta, 2))+(Math.pow(resta2, 2)));
//        
//        return calcular;
        
        double restaX, restaY, distancia;
        
        DecimalFormat df = new DecimalFormat("#.##");
        //d = raiz([X2 - X1]^2 + [Y2 - Y1]^2)
        restaX = Math.pow((x2-x1), 2) ;
        restaY = Math.pow((y2 - y1), 2);
        
        distancia = Math.sqrt((restaX+restaY));
        System.out.println("--------------------------------------------------");
        System.out.println("     D(P1,P2) = " + df.format(distancia));
        
    } 
    
}
