/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class ServicioPersona {
    




    public Persona iniciarPersona() {
        Persona p1 = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento dd/mm/yyyy");
        p1.setDia(leer.nextInt());
        p1.setMes(leer.nextInt());
        p1.setAño(leer.nextInt());
        Date fecha = new Date((p1.getAño()-1900),(p1.getMes()-1), p1.getDia() );
        p1.setNacimiento(fecha);
        return p1;
    }

    public void calcularEdad(Persona p1) {
        Date fechaActual = new Date();

//        long diffEnMilisegundos = fechaActual.getTime() - p1.getNacimiento().getTime();
//        long diffEnAnios = (long) (diffEnMilisegundos / (1000L * 60 * 60 * 24 * 365.25));
//
//        System.out.println("La edad de esta persona es " + diffEnAnios);
        
        fechaActual.getYear();
        int diferencia=fechaActual.getYear()-p1.getNacimiento().getYear();
        System.out.println(diferencia);
    }

    public void menorQue(Persona p1) {
        Scanner leer = new Scanner(System.in);
        int edad, edadPersona;
        Date fechaActual = new Date();
//        long diffEnMilisegundos = fechaActual.getTime() - p1.getNacimiento().getTime();
//        long diffEnAnios = (long) (diffEnMilisegundos / (1000L * 60 * 60 * 24 * 365.25));
//        edadPersona = (int) diffEnAnios;
       boolean mayor = false;
//        System.out.println("Ingrese la edad de la persona que esta ocupando este programa");
//        edad = leer.nextInt();
//
//        if (edad>edadPersona){
//            mayor=true;
//        }else if (edad<=edadPersona){
//            mayor=false;
//        }
//        System.out.println("La persona que ocupa esta programa es mayor a la persona ingresada? "+ mayor);
        edad=fechaActual.getYear()-p1.getNacimiento().getYear();
        System.out.println("Ingrese la edad de la persona que este ocupando este programa");
        edadPersona=leer.nextInt();
        
        if (edad>edadPersona) {
            mayor=true;
            
        }else if (edad <=edadPersona){
            mayor=false;
        }
        System.out.println("La edad de la persona es mayor a la persona que esta ocupando este programa?"+mayor);

    }
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de nacimiento: " + p1.getNacimiento());
        Date fechaActual=new Date();
        long diffEnMilisegundos = fechaActual.getTime() - p1.getNacimiento().getTime();
        long diffEnAnios = (long) (diffEnMilisegundos / (1000L * 60 * 60 * 24 * 365.25));
        System.out.println("Edad: " + diffEnAnios);
    }
}
