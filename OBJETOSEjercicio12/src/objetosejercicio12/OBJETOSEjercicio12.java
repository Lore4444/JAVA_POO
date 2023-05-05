/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package objetosejercicio12;

import Entidad.Persona;
import java.util.Scanner;
import Servicio.ServicioPersona;


/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Scanner leer=new Scanner (System.in);
        ServicioPersona ps=new ServicioPersona();
        
        
        Persona p1 = ps.iniciarPersona();
        int opc;
        boolean sal = false;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1-Calcular Edad");
            System.out.println("2-Mayor Que");
            System.out.println("3-Mostrar Datos");
            System.out.println("4-Salir");
            opc=leer.nextInt();
            switch (opc){
                case 1:
                    ps.calcularEdad(p1);
                    continue;
                case 2:
                    ps.menorQue(p1);
                    continue;
                case 3:
                    ps.mostrarPersona(p1);
                    continue;
                case 4:
                    sal=true;
            }
        } while (sal != true);

    }
}




