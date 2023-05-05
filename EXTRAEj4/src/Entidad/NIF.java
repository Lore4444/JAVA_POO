/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V

18 H
19 L
20 C
21 K
22 E
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class NIF {
    
    private long DNI;
    private String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    
//Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    
    public void crearNif(){
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su DNI -hasta 8 digitos-");
        DNI=leer.nextLong();
        letra=calcular();

       
    }
    
//La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente.
    
    public String calcular(){
        
       int resto;
       resto=(int)DNI%23;
       
       
//       String []letras=new String[23];  
//       letras[0]="T";
//       letras[1]="R";
//       letras[2]="W";
//       letras[3]="A";
//       letras[4]="G";
//       letras[5]="M";
//       letras[6]="Y";
//       letras[7]="F";
//       letras[8]="P";
//       letras[9]="D";
//       letras[10]="X";
//       letras[11]="B";
//       letras[12]="N";
//       letras[13]= "J";
//       letras[14]="Z";
//       letras[15]="S";
//       letras[16]="Q";
//       letras[17]="V";
//       letras[18]="H";
//       letras[19]="L";
//       letras[20]="C";
//       letras[21]="K";
//       letras[22]="E";
       
       String[] letras = {"T", "R", "W'", "A", "G", "M", "Y", "F", "P", "D",
           "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
       //No necesita inicializar el vector, los espacios estan dados por la informacion

        letra=letras[resto];      
        
        return letra;
       
    }
    
// Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
    
    public void mostrar(){
        System.out.println("El NIF es "+DNI+ " - "+letra);
        
    }
    
}
