/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.colec;

import Service.PeliculaService;

/**
 *
 * @author Raul
 */
public class Ejercicio4Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        
        ps.crearListaPeliculas();
        System.out.println("******************LAS PELICULAS DE LA LISTA SON: ");
        ps.mostrarPeliculas();
        System.out.println("********PELICULAS CON DURACION MAYOR A UNA HORA: ");
        ps.mostrarPeliculasDuracionMayor1Hora();
        System.out.println("**********LISTA ORDENADA POR DURACION DESCENDENTE");
        ps.ordenarPorDuracionDesc();
        ps.mostrarPeliculas();
        System.out.println("***********LISTA ORDENADA POR DURACION ASCENDENTE");
        ps.ordenarPorDuracionAscen();
        ps.mostrarPeliculas();
        System.out.println("************************LISTA ORDENADA POR TITULO");
        ps.ordenarPorTitulo();
        ps.mostrarPeliculas();
        System.out.println("**********************LISTA ORDENADA POR DIRECTOR");
        ps.ordenarPorDirector();
        ps.mostrarPeliculas();
    }
}
