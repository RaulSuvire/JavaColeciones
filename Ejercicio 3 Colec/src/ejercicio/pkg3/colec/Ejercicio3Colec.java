/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.colec;

import Entidades.Alumno;
import Servicios.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio3Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService as = new AlumnoService();
        
        as.crearListaAlumnos();
        
        System.out.println("Ingrese el nombre del alumno para saber la nota final");
        String nombre = leer.next();
        Alumno a = as.buscarAlumno(nombre);
        if (a != null) {
            System.out.println("La nota final del alumno es: " + as.notaFinal(a));
        } else {
            System.out.println("El alumno ingresado no está en la lista");
        }
    }
}
