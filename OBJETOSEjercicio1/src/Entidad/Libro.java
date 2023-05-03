/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Entidad;

/**
 *
 * @author lorena
 */
public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NumPag;

    public Libro(String ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    public Libro() {
    }
    
    //Es aconsejable crear un constructor con los atributos y uno vacio 

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPag() {
        return NumPag;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPag(int NumPag) {
        this.NumPag = NumPag;
    }

    @Override
    public String toString() {
        return "Las caracteristicas del Libro son:  "+"\n" + "ISBN=" + ISBN + "\n"+ " Titulo=" + Titulo +" \n"+ " Autor=" + Autor + " \n"+"NumPag=" + NumPag ;
    }
    
    
}
