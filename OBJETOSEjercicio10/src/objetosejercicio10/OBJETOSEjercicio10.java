/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package objetosejercicio10;

import Entidad.Array;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Array A1=new Array();
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("El vector A ordenado es ");
        System.out.println(A1.ordenar());
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("El vector B es ");
        
        A1.vectorB();
       
    }
    
}

