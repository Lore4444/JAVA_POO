/*
  Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class opService {
    
    Scanner leer=new Scanner(System.in);
        Operacion miOperacion=new Operacion();
        
    public void crearOperacion(){
        
        System.out.println("Ingrese un numero 1");
        miOperacion.setNumero1(leer.nextDouble());
        
        System.out.println("Ingrese un numero 2");
        miOperacion.setNumero2(leer.nextDouble());
        
        System.out.println("el numero uno es:");
        System.out.println(String.format("%.2f",miOperacion.getNumero1()));
        
        System.out.println("El numero 2 es:");
        System.out.println(String.format("%.2f",miOperacion.getNumero2()));
        
    }
    
     //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar () {
        return miOperacion.getNumero1()+miOperacion.getNumero2();
        
   }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(){
        return (miOperacion.getNumero1()-miOperacion.getNumero2());
   }
    /*g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si 
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. 
Si no, se hace la multiplicación y se devuelve el resultado al main */
     public double multiplicar(){
         if(miOperacion.getNumero1()==0 || miOperacion.getNumero2()==0){
            System.out.println("NO es posible multiplicar");
             return 0;
         } else {
             
             return miOperacion.getNumero1()*miOperacion.getNumero2();
         }
     }
    /*h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar 
    una división por cero, el método devuelve 0 y se le informa al usuario el error se le 
    informa al usuario. Si no, se hace la división y se devuelve el resultado al main. 
    */
     public double dividir(){
         if (miOperacion.getNumero1()==0 || miOperacion.getNumero2()==0){
            System.out.println("NO es posible dividir");
             return 0;
         } else {
         
             return miOperacion.getNumero1()/miOperacion.getNumero2();
         }
     }
}

    

