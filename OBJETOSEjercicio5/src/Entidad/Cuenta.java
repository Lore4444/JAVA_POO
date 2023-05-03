/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private int saldo;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, int saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void crearCuenta(){
        //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cuenta");
        numeroCuenta=leer.nextInt();
        
        System.out.println("Ingrese el dni");
        dni=leer.nextLong();
        
        System.out.println("Ingrese el saldo");
        saldo=leer.nextInt();
        
        System.out.println("Ingrese la tasa de interes");
        interes=leer.nextDouble();
        
    }
    
    public void ingresar (double ingreso){
        //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        //y se la sumara a saldo actual.
        saldo+=ingreso;
        
    }
    
    public void retirar (double retiro){
        //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        //pondrá el saldo actual en 0.
        
        if(retiro>saldo){
            saldo=0;
            
        }else{
            saldo-=retiro;
        }
    }
    
    public void extraccionRapida (double retiro){
        //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        //usuario no saque más del 20%.
        if(retiro>(saldo+0.2)){
            System.out.println("No se permite retirar mas del 20% del saldo");
        }else{
            saldo-=retiro;
        }
        
    }
    
    public double consultarSaldo(){
        return saldo;
        
        //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    }
    
    public String consultarDatos(){
        
        return "Numero de cuenta: \n"+numeroCuenta+"\n"+ "dni" +dni+ "\n"+"saldo"+saldo+"\n"+"interes"+interes;
        //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    }

    @Override
    public String toString() {
        return "Los datos de la Cuenta son:" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
}
