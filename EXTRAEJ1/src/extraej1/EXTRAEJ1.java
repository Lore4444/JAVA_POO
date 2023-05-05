/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej1;

import Entidad.Cancion;

/**
 *
 * @author lorena
 */
public class EXTRAEJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cancion miCancion = new Cancion();
        miCancion.crearCancion();
        System.out.println(miCancion.toString());

    }
    
}
