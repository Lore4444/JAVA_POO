/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package objetosejercicio9;

import Entidad.Matematica;
import Servicios.ServiciosMatematica;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matematica miMat=new Matematica();
        ServiciosMatematica M1=new ServiciosMatematica();
        
        
        miMat.setNum1(Math.random()*10);
        miMat.setNum2(Math.random()*10);
        
        System.out.println("El numero 1 es "+String.format("%.2f",miMat.getNum1())+" y el numero 2 es "+String.format("%.2f", miMat.getNum2()));
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        M1.devolverMayor(miMat.getNum1(),miMat.getNum2());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println(M1.calcularPotencia(miMat.getNum1(),miMat.getNum2()));
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("La raiz cuadrada del numero menor es "+M1.calcularRaiz(miMat.getNum1(),miMat.getNum2()));
        
    }
    
}



