/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class servicioAhorcado {

    Ahorcado miJuego = new Ahorcado();
    String[] verAhorcado;

////Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
////Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
////vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
////de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
////máximas, el valor que ingresó el usuario y encontradas en 0.
//    
    public void crearJuego() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a buscar");
        String palabra = leer.next();
        miJuego.llenarVectorPalabra(palabra);

        System.out.println("Ingrese la cantidad de jugadas maximas");
        miJuego.setMaxJugadas(leer.nextInt());
        miJuego.setLetrasEncontradas(0);

        miJuego.longitudPalabra();
        System.out.println("Tienes " + miJuego.getMaxJugadas() + " vidas");

        verAhorcado = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            verAhorcado[i] = "_";

        }

    }

//    Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(String letra) {

        int letraRepetidas = 0;

        for (int i = 0; i < miJuego.getPalabraABuscar().length; i++) {

            if (miJuego.getPalabraABuscar()[i].equals(letra)) {
                miJuego.getPalabraABuscar()[i] = " "; //para cuando repetis la letra
                verAhorcado[i] = letra;

                letraRepetidas++;

            }

        }

        if (letraRepetidas > 0) {
            System.out.println("La letra se encuentra " + letraRepetidas + " veces en la palabra secreta");
            System.out.println(Arrays.toString(verAhorcado));
        } else {
            miJuego.RestarIntentos();
            System.out.println("La letra no se encuentra en la palabra secreta");
            System.out.println(Arrays.toString(verAhorcado));
        }

        miJuego.sumaLetrasEncontradas(letraRepetidas);

    }

//    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//    
    public void encontradas() {

        System.out.println("Se han encontrado " + miJuego.getLetrasEncontradas() + " letras de la palabra secreta");
        System.out.println("Faltan " + (miJuego.getPalabraABuscar().length - miJuego.getLetrasEncontradas()) + " letras para completar la palabra");

        if (miJuego.getLetrasEncontradas() == miJuego.getPalabraABuscar().length) {

            System.out.println("Felicitaciones, has ganado!!!");
            miJuego.setMaxJugadas(0);
        } else if (miJuego.getLetrasEncontradas() > 0 || miJuego.getLetrasEncontradas() < miJuego.getPalabraABuscar().length) {

            System.out.println("Te quedan " + miJuego.getMaxJugadas() + " vidas");
        }
    }

//    Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego() {
        Scanner leer = new Scanner(System.in);

        crearJuego();
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        do {
            System.out.println("Ingrese la letra ");
            String letra = leer.next();

            buscar(letra);
            System.out.println("");
            encontradas();
            System.out.println("++++++++++++++++++++++++++++++++++++++");

        } while (miJuego.getMaxJugadas() != 0);

    }

}
