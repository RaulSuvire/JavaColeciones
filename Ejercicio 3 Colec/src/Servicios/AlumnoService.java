/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class AlumnoService {
    
    Scanner leer;
    ArrayList<Alumno> listAlumno = new ArrayList();
    
    public void crearListaAlumnos(){
        
        leer = new Scanner(System.in).useDelimiter("\n");
        String sn = "s"; //se inicializa en 's' para que se cree por lo menos 1 alumno
        Integer nota;
        
        do {
            if (sn.equalsIgnoreCase("s")) {
                ArrayList<Integer> notas = new ArrayList();
                System.out.println("Ingrese el nombre del alumno");
                String nombre = leer.next();
                System.out.println("Ingrese las 3 notas: ");
                   for (int i = 0; i < 3; i++) {
                     System.out.println("Ingrese la nota "+ (i+1));
                     nota = leer.nextInt();
                     notas.add(nota);
                    }
                Alumno a = new Alumno(nombre, notas);
                listAlumno.add(a);
            } else {
                if(!sn.equalsIgnoreCase("n")){
                    System.out.println("El caracter ingresado no es correcto");
                }
            }
            System.out.println("Desea agregar otro alumno? S/N");
            sn = leer.next();
        } while (!sn.equalsIgnoreCase("n"));
    }
    
    public Alumno buscarAlumno(String nombre){
        for (Alumno alumno : listAlumno) {
            if (nombre.equalsIgnoreCase(alumno.getNombre())) {
                return alumno;
            }
        }
        return null;
    }
    
    public double notaFinal(Alumno a){
        int acum = 0;
        for (Integer nota : a.getNotas()) {
            acum += nota;
        }
        return acum/3;
    }
}
