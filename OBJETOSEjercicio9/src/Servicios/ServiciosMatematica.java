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
package Servicios;

/**
 *
 * @author lorena
 */
public class ServiciosMatematica {
   
//Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    
    public void devolverMayor(double num1,double num2){
        
        System.out.println("El numero mayor es:"+String.format("%.2f",Math.max(num1, num2)));
        
    }
   
 //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.  
    
    public int calcularPotencia(double num1,double num2){
        
        System.out.println("La potencia del numero mayor elevado al numero menor es :");
        return (int)Math.pow(Math.max(num1, num2), Math.min(num1, num2));  
        
    }
        
//Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número..   
    
    
    public double calcularRaiz(double num1,double num2){
        
       return Math.sqrt(Math.abs(Math.min(num1, num2)));

    }
        
    }
    



