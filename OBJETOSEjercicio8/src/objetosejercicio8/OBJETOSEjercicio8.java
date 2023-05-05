/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package objetosejercicio8;

import Entidad.Cadena;
import Servicio.serviciosCadena;
import java.util.Scanner;






/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cadena miFrase=new Cadena();
        Scanner leer=new Scanner(System.in);
        serviciosCadena miCadena=new serviciosCadena();
        
        System.out.println("Ingrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        miFrase.setFrase(leer.nextLine());
        miFrase.setLongitud(miFrase.getFrase().length());
        
        //C1.setLongitud(C1.getFrase().length());
        
        System.out.println("la frase es "+miFrase.getFrase()+" , y la longitud es "+miFrase.getLongitud()); 
        
        //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("La frase contiene  "+miCadena.mostrarVocales(miFrase.getFrase(),miFrase.getLongitud())+" vocales");
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
   
        System.out.println("La frase de manera invertida es " );
        
        miCadena.invertirFrase(miFrase.getFrase(),miFrase.getLongitud());
        
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        
         //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

        System.out.println("Ingrese una letra, para saber cuantas veces se repite en la frase");
        String letra=leer.next();
        
        System.out.println("La letra ingresada se repite " +miCadena.vecesRepetido(miFrase.getFrase(),miFrase.getLongitud(), letra)+ " veces");
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//compone la clase con otra nueva frase ingresada por el usuario.

        System.out.println("Ingrese una nueva frase para compararla con la frase original");

        String g=leer.nextLine();
        miCadena.compararLongitud(miFrase.getLongitud(), leer.nextLine());
             
//       Se puede colocar directamente en el parametro una frase que no es el atributo sino la frase nueva          


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        

//Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.

     miCadena.unirFrases(miFrase.getFrase());
       
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");


//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.

        System.out.println("Ingrese un caracter para reemplazarlo por las letras a que contienen la frase");
        
        letra=leer.next();
        miCadena.reemplazar(letra,miFrase.getFrase());
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        
//Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
//        
        System.out.println(miCadena.contiene(miFrase.getFrase()));
        
        
        
        
    }
    
}

