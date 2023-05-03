/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class LibroService {
    
    public Libro crearLibro(){
        
        Scanner leer=new Scanner (System.in);
        
        //creo el objeto libro llamado mi libro, lo puedo usar vacio, porque cree el contructor vacio en la clase libro
        Libro miLibro=new Libro();
        
        System.out.println("Ingrese el ISBN del Libro");
        miLibro.setISBN(leer.next());
        
        System.out.println("Ingrese el Titulo del Libro");
        miLibro.setTitulo(leer.next());
        
        System.out.println("Ingrese el Autor del Libro");
        miLibro.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de paginas");
        miLibro.setNumPag(leer.nextInt());
        
        return miLibro;
        
    }
    
}
