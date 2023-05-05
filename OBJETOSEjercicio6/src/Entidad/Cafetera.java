/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Cafetera {
    
   private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
   
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
      
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
      
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("Se lleno la cafetera al maximo: " + cantidadActual);
    }

    public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("Se ha servido una taza de " + tamanoTaza);
        } else {
            System.out.println("No hay suficiente cafe para llenar la taza.");
            System.out.println("Se ha servido una taza de " + cantidadActual);
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Se vacio la cafetera: " + cantidadActual);
    }

    public void agregarCafe(int cantidad) {
        cantidadActual += cantidad;
        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;

        }
        System.out.println("Se agrego cafe: " + cantidadActual);
    }
}
