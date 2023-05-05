/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }
    
    
    
    
    //Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo.

    public void ingresarCodigo(int [] codigo){

    Scanner leer=new Scanner(System.in);


    for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese los 7 numeros del codigo ");
            codigo[i]=leer.nextInt();
}
    }
    
    
    //otra manera de hacer el metodo
    public void crearCodigo2(int[]codigo){
        Scanner leer=new Scanner(System.in);
        String cadena;
        
        System.out.println("Ingrese el numero total del codigo");
        cadena=leer.next();
        
        for (int i = 0; i < 7; i++) {
            codigo[i]=Integer.parseInt(cadena.substring(i, i+1));
            
        }
        
    }
    

//Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
    
    public void cargarCelular(){
        //public void cargarCelular(Movil miMovil){
        //le puedo poner como parametro el objeto Movil al metodo (el nombre puedo ser igual o no al objeto del main), 
        //yo le envio el objeto al metodo con el fin de usar el mismo metodo con distintos objetos, sin necesidad de 
        //crear en el main muchos objetos tipo service, por ej tengo muchos celulares y uso el mismo metodo
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la marca del celular");
        marca=leer.next();
        System.out.println("Ingrese el precio del celular");
        precio=leer.nextDouble();
        System.out.println("Ingrese el modelo de celular");
        modelo=leer.next();
        System.out.println("Ingrese la memoria RAM");
        memoriaRam=leer.nextInt();
        System.out.println("Ingrese almacenamiento");
        almacenamiento=leer.nextInt();
        
        codigo=new int[7];
       
        ingresarCodigo(codigo);
       
        for (int i = 0; i < 7; i++) {
            System.out.print(codigo[i]);
        }
        System.out.println(" ");
        
        //si hay service
        //ingresarCodigo(Movil.getCodigo());
        
    }
}
    

    
   
    
    

