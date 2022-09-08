/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pais;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Raul
 */
public class PaisService {
    
    Scanner leer;
    HashSet<Pais> pais = new HashSet();

    public void agregarPais() {
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del pais que desea agregar");
        String nombre = leer.next();
        Pais p = new Pais(nombre);
        pais.add(p);
    }

    public void mostrarPaises() {
        for (Pais p : pais) {
            System.out.println(p.toString());
        }
    }

    public void ordenar_Y_MostarPaises() {
        //pais.stream().sorted(Comparadores.ordenarPorNombre).forEach(System.out::println); //Sirve para ordenar los objetos del conjunto pero no los guarda
        ArrayList<Pais> listPais = new ArrayList(pais);
        Collections.sort(listPais, Comparadores.ordenarPorNombre);
        for (Pais p : listPais) {
            System.out.println(p.toString());
        }
    }

    public boolean buscarPais(String borrarPais) {
        for (Pais p : pais) {
            if (p.getNombre().equalsIgnoreCase(borrarPais)) {
                return true;
            }
        }
        return false;
    }

    public void eliminarPais(String borrarPais) {
        Iterator<Pais> it = pais.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(borrarPais)) {
                it.remove();
            }
        }
    }
    
}
