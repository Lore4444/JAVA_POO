/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author lorena
 */
public class Array {
    
  
    private  double [] M1=new double[50];
    private double [] M2 =new double[20];    

    public Array() {
 
    
    System.out.println("El vector A es :");
    
     
        for (int i = 0; i < 50; i++) {
            M1[i]= Math.random()*100;
            System.out.print("["+String.format("%.1f", M1[i])+"]");
        }
        System.out.println(" ");
        
    }
    
 public String ordenar(){
         
         Arrays.sort(M1);
  
        for (int i = 0; i < 50; i++) {
         
            System.out.print("["+String.format("%.2f", M1[i])+"]");
          
        }
         
        
        return "0";
         
     }
 
 public void vectorB(){
     
      for (int i = 0; i < 20; i++) {
          
      if (i<10){
              M2[i]=M1[i];
              
        } else if (i<11||i<20){
              M2[i]=0.5;
              }
     
          System.out.println("["+String.format("%.2f", M2[i])+"]");
 }

}
}
 

   
 