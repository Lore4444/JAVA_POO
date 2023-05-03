/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosejercicio5;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class OBJETOSEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cuenta C1=new Cuenta();
        C1.crearCuenta();
        
        int opcion;
        do {
            System.out.println("SISTEMA BANCARIO");
            System.out.println("Elija una opcion");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4.Consultar Saldo");
            System.out.println("5. Consultar datos");
            System.out.println("Salir");
            
            opcion=leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("DEPOSITAR. Ingrese el valor a depositar");
                    C1.ingresar(leer.nextDouble()); break;
                
                case 2:
                    System.out.println("RETIRAR. Ingrese el valor a retirar");
                    C1.retirar(leer.nextDouble()); break;
                            
                case 3:
                    System.out.println("EXTRACCION RAPIDA. Ingrese el valor a retirar");
                    C1.extraccionRapida(leer.nextDouble()); break;
                    
                case 4:
                    System.out.println("CONSULAR SALDO. El saldo de su cuenta es: " +C1.consultarSaldo());
                    break;
                    
                case 5:
                    System.out.println("CONSULTAR DATOS. Los datos de su cuenta son: " +C1.consultarDatos());
                    break;
                    
                case 6:
                    System.out.println("* Gracias por usar el sistema *");break;
                    
                default: System.out.println("Opcion no valida");break;
            }
            
        } while (opcion!=6);
        
        
        
    }
    
}
