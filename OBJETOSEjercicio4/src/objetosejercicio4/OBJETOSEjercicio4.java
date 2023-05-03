/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosejercicio4;

import Entidad.Rectangulo;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rectangulo miRectangulo=new Rectangulo();
        
        miRectangulo.crearRectangulo();
        
        System.out.println("La superficie es: "+miRectangulo.calcularSuperficie());
        
        System.out.println("El perimetro es: "+miRectangulo.calcularPerimetro());
        
        miRectangulo.dibujar();
        
    }
    
}
