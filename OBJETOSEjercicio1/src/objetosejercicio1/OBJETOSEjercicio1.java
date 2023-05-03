/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package objetosejercicio1;

import Entidad.Libro;
import Service.LibroService;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroService libroPrimero=new LibroService();
        
        //En el main el libro puede tener o no el mismo nombre que el colocado en el metodo
        Libro miLibro=libroPrimero.crearLibro();
        
        System.out.println(miLibro.toString());
    }
    
}
