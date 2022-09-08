/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Comparator;
import Entidades.Pelicula;

/**
 *
 * @author Raul
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAscen = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    };
}
