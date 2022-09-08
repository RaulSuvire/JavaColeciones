/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class ProductoService {
    
    Scanner leer;
    
    HashMap<String,Double> productos = new HashMap();
    
    public void agregarProducto() {
        leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        Double precio;
        System.out.println("Nombre del producto: ");
        nombre = leer.next();
        System.out.println("Precio: ");
        precio = leer.nextDouble();
        Producto p = new Producto(nombre, precio);
        productos.put(p.getNombre(), p.getPrecio());
    }

    public boolean buscarProducto(String producto) {
        for (String nombre : productos.keySet()) {
            if (nombre.equalsIgnoreCase(producto)) {
                return true;
            }
        }
        return false;
    }

    public void modificarPrecio(String producto) {
        leer = new Scanner(System.in).useDelimiter("\n");
        Double precio;
        System.out.println("Ingrese el nuevo precio");
        precio = leer.nextDouble();
        for (Map.Entry<String,Double> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(producto)) {
                entry.setValue(precio);
            }
        }
    }

    public void eliminarProducto(String producto) {
        productos.remove(producto);
    }

    public void mostrarProductos() {
        for (Map.Entry<String,Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() +
                               "\nPrecio: " + entry.getValue());
        }
    }
    
}
