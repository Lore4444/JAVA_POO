/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package extraej5;

import Entidad.MesSecreto;
import java.util.Scanner;
//import Servicio.servicioSecreto;


/**
 *
 * @author lorena
 */
public class EXTRAEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MesSecreto s1=new MesSecreto();
        Scanner leer=new Scanner(System.in);
        
        s1.crearMeses();
        String mes;
        
        do {
            System.out.println("Adivine el mes secreto");
        mes=leer.next().toLowerCase();
            
            
        } while (!mes.equalsIgnoreCase(s1.getMesSecreto()));
        
        System.out.println("Ha acertado");
        
        
        }
        
    
}

