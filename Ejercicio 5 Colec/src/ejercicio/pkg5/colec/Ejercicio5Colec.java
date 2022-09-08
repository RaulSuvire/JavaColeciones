/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.colec;

import Service.PaisService;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio5Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisService ps = new PaisService();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String sn = "s";
        String borrarPais;
        
        System.out.println("**********************************PROGRAMA PAISES");
        
        do {
            if (sn.equalsIgnoreCase("s")) {
                ps.agregarPais(); //agrega pais a la lista (la lista esta en el servicio)
            } else {
                if(!sn.equalsIgnoreCase("n")){
                    System.out.println("El caracter ingresado no es correcto");
                }
            }
            System.out.println("Desea agregar otro pais? S/N");
            sn = leer.next();
        } while (!sn.equalsIgnoreCase("n"));
        System.out.println("**********************************LISTA DE PAISES");
        ps.mostrarPaises();
        System.out.println("********LISTA DE PAISES ORDENADOS ALFABETICAMENTE");
        ps.ordenar_Y_MostarPaises();
        System.out.println("*********************************ELIMINAR UN PAIS");
        System.out.println("Ingrese un pais para eliminarlo de la lista");
        borrarPais = leer.next();
        if (ps.buscarPais(borrarPais)) {
            ps.eliminarPais(borrarPais);
            System.out.println("LISTA SIN EL PAIS");
            ps.ordenar_Y_MostarPaises();
        }else{
            System.out.println("El pais no se escuentra en la lista");
        }
    }
    
}
