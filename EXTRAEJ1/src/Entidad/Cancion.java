/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Cancion " + "titulo=" + titulo + ", autor=" + autor;
    }

    
   
    
    public void crearCancion(){
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el titulo de la cancion");
        titulo=leer.nextLine();
        System.out.println("Ingrese el autor");
        autor=leer.nextLine();
       
        
    }

   
   
}
