/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class ServicioRaices {
    
    public Raices crearRaices(){
        Raices miRaiz=new Raices();
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los valores de los coeficientes");
        System.out.println("1 coeficiente");
        miRaiz.setA(leer.nextDouble());
        System.out.println("2 coeficiente");
        miRaiz.setB(leer.nextDouble());
        System.out.println("3 coeficiente");
        miRaiz.setC(leer.nextDouble());
        return miRaiz;
        
    }
    
    
    
//Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    
    public double getDiscriminante(Raices miRaiz){
        
        double discriminante=(Math.pow(miRaiz.getB(),2))-(4*miRaiz.getA()*miRaiz.getC());
        
        return discriminante;
        
    }
    
    
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    
    public boolean tieneRaices(Raices miRaiz){
        return getDiscriminante(miRaiz)>=0;
        
        
    }
    
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    
    public boolean tieneRaiz(Raices miRaiz){
        return getDiscriminante(miRaiz)==0;
            
            
    }
  
    
    
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
    
    public void obtenerRaices(Raices miRaiz){
        
//Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
        if(tieneRaices(miRaiz)){
            
            double solucion1=(-miRaiz.getB()+Math.sqrt(getDiscriminante(miRaiz)))/(2*miRaiz.getA());
            double solucion2=(-miRaiz.getB()-Math.sqrt(getDiscriminante(miRaiz)))/(2*miRaiz.getA());
            
            System.out.println("Las dos raices son: 1 =" +solucion1+" y 2 = "+solucion2);
            
        }
        
    }
    
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    
    public void obtenerRaiz(Raices miRaiz){
       
        if (tieneRaiz(miRaiz)){
            
            double solucion=-miRaiz.getB() / (2 * miRaiz.getA());
            
            
            System.out.println("La unica raiz es"+solucion);
            
        }
        
    }
       
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    
    public void calcular(Raices miRaiz){
        
        if(tieneRaices(miRaiz)){
            obtenerRaices(miRaiz);
        }else if(tieneRaiz(miRaiz)){
            obtenerRaiz(miRaiz);
        }else{
            System.out.println("No tiene solucion");
        }
        
    }
    
    
    }

