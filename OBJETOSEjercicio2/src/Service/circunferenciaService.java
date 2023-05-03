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
package Service;

import Entidad.circunferencia;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class circunferenciaService {
    
    public circunferencia crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        
        circunferencia miCirculo=new circunferencia();
        
        System.out.println("Ingrese el radio");
        miCirculo.setRadio(leer.nextDouble());
        
       
        //Cálculo del área y setteo del mismo
        double y = miCirculo.getRadio();
        double x= miCirculo.calcularArea(y);
        miCirculo.setArea(x);  
        
        //Cálculo del perímetro  y setteo del mismo
        miCirculo.setPerimetro(miCirculo.calcularPerimetro(miCirculo.getRadio()));
        
        
        
        return miCirculo;
        
    }
    
}



/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author DanielPalma

public class CircunService {
    
    public Circunferencia crearCircunferencia(){
        
        Scanner read = new Scanner(System.in);
        Circunferencia miCirculo = new Circunferencia();
        
        System.out.println("Ingrese el radio");
        miCirculo.setRadio(read.nextDouble());
        //Cálculo del área y setteo del mismo
        double y = miCirculo.getRadio();
        double x= miCirculo.calculoArea(y);
        miCirculo.setArea(x);   
        //Cálculo del períemtro  y setteo del mismo
        miCirculo.setPerimetro(miCirculo.calculoPerimetro(miCirculo.getRadio()));
        
        return miCirculo;
 
    }
    
    
}

*/