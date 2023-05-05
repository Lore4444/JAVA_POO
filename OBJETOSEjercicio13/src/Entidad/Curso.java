/*
  Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Curso {

    private String nombreCurso;
    private double cantidadHorasPorDias;
    private double cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDias, double cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDias = cantidadHorasPorDias;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getCantidadHorasPorDias() {
        return cantidadHorasPorDias;
    }

    public double getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDias(double cantidadHorasPorDias) {
        this.cantidadHorasPorDias = cantidadHorasPorDias;
    }

    public void setCantidadDiasPorSemana(double cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
//Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
    
    public void cargarAlumnos(String[] alumnos){
    
    Scanner leer=new Scanner(System.in);
    
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno numero "+(i+1)+" :");
            alumnos[i]=leer.nextLine();
            
        }
            
        }

//Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos.
    
    public void crearCurso(){
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese el nombre del curso");
        nombreCurso=leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por dia");
        cantidadHorasPorDias=leer.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana");
        cantidadDiasPorSemana=leer.nextDouble();
        System.out.println("Ingrese si se trata de turno: mañana o tarde");
        leer.nextLine();
        turno=leer.nextLine();
        System.out.println("Ingrese el precio por hora");
        precioPorHora=leer.nextDouble();
        alumnos=new String[5];
        cargarAlumnos(alumnos);
        
    }
    
//Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    
    public double calcularGananciaSemanal(){
        double ganancia=cantidadHorasPorDias*precioPorHora*cantidadDiasPorSemana*5;
        
        return ganancia;
        
    }
    
    public void mostrarCurso(){
        
        System.out.println("el nombre del curso es: "+nombreCurso);
        System.out.println("Los alumnos del curso son: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(" * "+alumnos[i]+" * ");
            
        }
        System.out.println("La cantidad de horas  por dia son "+cantidadHorasPorDias);
        System.out.println("La cantidad de dias por semana es "+ cantidadDiasPorSemana);
        System.out.println("El turno del curso es "+turno);
        System.out.println("El precio por hora es "+precioPorHora);
        System.out.println("La ganacia semanal es "+calcularGananciaSemanal());

    }
    
}

