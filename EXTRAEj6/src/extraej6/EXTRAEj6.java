/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraej6;

import servicio.servicioAhorcado;

/**
 *
 * @author lorena
 */
public class EXTRAEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        servicioAhorcado juego1 = new servicioAhorcado();

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("          **EL AHORCADO**                                             ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        juego1.juego();

    }

}
