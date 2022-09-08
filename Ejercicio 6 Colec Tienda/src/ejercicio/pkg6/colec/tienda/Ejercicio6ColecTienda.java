/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6.colec.tienda;

import Service.ProductoService;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class Ejercicio6ColecTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoService ps = new ProductoService();
        int op;
        String sn;
        String producto;
        
        do {
            System.out.println("*********TIENDA*********");
            System.out.println("MENU: (elija una opcion)");
            System.out.println("1. Ingresar un producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Salir");
            System.out.println("Opcion: ");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    ps.agregarProducto();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto");
                    producto = leer.next();
                    if (ps.buscarProducto(producto)) {
                        ps.modificarPrecio(producto);
                    }else{
                        System.out.println("El producto no se encuentra en la lista");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto que quiere eliminar");
                    producto = leer.next();
                    ps.eliminarProducto(producto);
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Desea salir de la aplicacion? S/N");
                    sn = leer.next();
                    if (sn.equalsIgnoreCase("s")) {
                        break;
                    } else {
                        if (!sn.equalsIgnoreCase("n")) {
                            System.out.println("El caracter ingresado no es correcto");
                            op = 0;
                        }else{
                            op = 0;
                        }
                    }
                    break;
                default:
                    System.out.println("La opcion no es correcta, ingrese otra");
            }
            System.out.println("----------------------------");
        } while (op != 5);
        
    }
    
}
