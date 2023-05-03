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
package objetosejercicio2;

import Entidad.circunferencia;
import Service.circunferenciaService;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        circunferenciaService circulos= new circunferenciaService(); //crea servicio
        circunferencia miCirculo=circulos.crearCircunferencia();//crea objeto
        
        System.out.println(miCirculo.toString());
        
        
        
    }
    
}

/*

package ejercicio02;

import Entidad.Circunferencia;
import Service.CircunService;

 * @author DanielPalma

public class Ejercicio02 {

    /**
     * @param args the command line arguments

    public static void main(String[] args) {
        
        CircunService cs = new CircunService();  //crear Servicio
        Circunferencia miCirculo = cs.crearCircunferencia();  //crear Objeto
        
        System.out.println(miCirculo.toString());  //Impresión de los datos con toString
        
    }
    
}*/
