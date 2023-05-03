/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package objetosejercicio7;

import Entidad.Persona;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] miPersona=new Persona[4];
        
        int pesomenor=0;
        int pesoideal=0;
        int pesomayor=0;
        int mayoredad=0;
        int menoredad=0;
        
        for (int i = 0; i < 4; i++) {
            miPersona[i]=new Persona();
            miPersona[i].crearPersona();
            miPersona[i].calcularIMC();
            miPersona[i].esMayorDeEdad();
        
       if(miPersona[i].calcularIMC()==-1){
                pesomenor++;
            }else if (miPersona[i].calcularIMC()==0){
                pesoideal++;
            
            }else {
                pesomayor++;
        }
        if(miPersona[i].esMayorDeEdad()==true){
                mayoredad++;
            }else if (miPersona[i].esMayorDeEdad()==false){
                menoredad++;
           
        }
            
        
            
        }
       
       
        System.out.println("Hay " +pesomenor+ " personas debajo del peso ideal, " + (pesoideal)+ " personas con peso ideal, y  "+pesomayor+ " personas con sobrepeso");
        System.out.println("El porcentaje de personas con sobrepeso es "+((pesomayor*100)/4)+" %");
        System.out.println("El porcentaje de personas con peso ideal es "+((pesoideal*100)/4)+" %");
        System.out.println("El porcentaje de personas debajo del peso ideal es "+((pesomenor*100)/4)+" %");
        
        System.out.println("Hay " +mayoredad+ " personas mayores de edad, y  " + menoredad+ " personas menores de edad  ");
        System.out.println("El porcentaje de personas mayores de edad es "+((mayoredad*100)/4)+" %");
        System.out.println("El porcentaje de personas menores de edad es "+((menoredad*100)/4)+" %");
        
    }
    
    
}
