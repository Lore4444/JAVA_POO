/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class ServicioCurso {
    
    Curso miCurso=new Curso();
    
    public void cargarAlumnos(){
        Scanner leer=new Scanner(System.in);
        
        
        for (int i = 0; i < miCurso.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno");
            miCurso.getAlumnos()[i]=leer.nextLine();
            //se usa el get y no el set porque es un arreglo(vector), para guardar los nombres en el vector
            
        }
    }
    
    
    
    
}
