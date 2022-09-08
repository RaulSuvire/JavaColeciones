/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class PeliculaService {
    
    Scanner leer;
    ArrayList<Pelicula> listaPelicula = new ArrayList();
    
    public void crearListaPeliculas() {
        
        leer = new Scanner(System.in).useDelimiter("\n");
        String sn = "s"; //se inicializa en 's' para que se cree por lo menos 1 pelicula
        
        do {
            if (sn.equalsIgnoreCase("s")) {
                System.out.println("Ingrese el nombre del titulo");
                String titulo = leer.next();
                System.out.println("Ingrese el nombre del director");
                String director = leer.next();
                System.out.println("Ingrese la duracion de la pelicula(en horas)");
                int duracion = leer.nextInt();
                Pelicula p = new Pelicula(titulo, director, duracion);
                listaPelicula.add(p);
            } else {
                if(!sn.equalsIgnoreCase("n")){
                    System.out.println("El caracter ingresado no es correcto");
                }
            }
            System.out.println("Desea agregar otra pelicula? S/N");
            sn = leer.next();
        } while (!sn.equalsIgnoreCase("n"));
    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula.mostrarPelicula());
        }
    }

    public void mostrarPeliculasDuracionMayor1Hora() {
        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.mostrarPelicula());
            }
        }
    }

    public void ordenarPorDuracionDesc() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDuracionDesc);
    }

    public void ordenarPorDuracionAscen() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDuracionAscen);
    }

    public void ordenarPorTitulo() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorTitulo);
    }

    public void ordenarPorDirector() {
        Collections.sort(listaPelicula, Comparadores.ordenarPorDirector);
    }
}
