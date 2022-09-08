/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.colec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio1Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> razasPerros = new ArrayList();
        String perro;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una raza de perro");
        perro = leer.nextLine();
        razasPerros.add(perro);
        
        while (!perro.equalsIgnoreCase("n")) {
            System.out.println("Desea ingresar otra raza de perro? S/N");
            perro = leer.nextLine();
            if (perro.equalsIgnoreCase("s")) {
                System.out.println("Ingrese una raza de perro");
                perro = leer.nextLine();
                razasPerros.add(perro);
            } else {
                if (!perro.equalsIgnoreCase("n")) {
                    System.out.println("El caracter ingresado no es correcto");
                } 
            }
        }
        System.out.println("------------------------");
        for (String aux : razasPerros) {
            System.out.println(aux);
        }
        System.out.println("------------------------");
        System.out.println("Ingrese la raza de un perro");
        perro = leer.nextLine();
        Iterator it = razasPerros.iterator();
        boolean ban = false;
        while (it.hasNext()) {
            if (it.next().equals(perro)) {
                it.remove();
                ban = true;
            }
        }
        if (ban) {
            for (String aux : razasPerros) {
            System.out.println(aux);
        }
        } else {
            System.out.println("La raza del perro no se encuentra");
            for (String aux : razasPerros) {
            System.out.println(aux);
        }
        }
    }
    
}
