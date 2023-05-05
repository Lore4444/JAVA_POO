/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package objetosejercicio11;

import java.util.Date;
import java.util.Scanner;



/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date fechaActual=new Date(123,2,27);
        //para año empieza a contar a partir de 1900, entonces para que de 2023 (1900+123)
        //para el mes empieza a contar desde 0, entonces para que de marzo (0,1,2) 
        
        Scanner leer=new Scanner(System.in);
        
        int dia,mes,anio,diferencia;
        
        System.out.println("INGRESE UNA FECHA");
        System.out.print("   * dia : ");
        dia = leer.nextInt();
        System.out.print("   * mes : ");
        mes = leer.nextInt();
        System.out.print("   * año : ");
        anio = leer.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        
        diferencia = fecha.getYear() - fechaActual.getYear();
        System.out.println("--------------------------------------------------");
        System.out.println("La diferencia es: " + diferencia);
        System.out.println("--------------------------------------------------");
        System.out.println("Fecha actual");
        //System.out.println(fechaActual.getDay() + " - " + fechaActual.getMonth() + " - " + fechaActual.getYear());
        System.out.println(fechaActual);
        
        
        
    }
}

   
