package Inventario;

import java.util.ArrayList;

/**
 * Clase que gestiona un inventario de productos
 * 
 * @author T0my
 * @version 1.0.7
 * @since 28/02/2025
 */
public class Inventario {
    /**
     * Lista de productos en el inventario
     */
    public ArrayList<Producto> listaProductos;

    /**
     * Constructor que inicializa una lista vacía de productos
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Agrega un producto al inventario
     * 
     * @param p Producto a añadir al inventario
     * @throws NullPointerException Si el producto pasado como parámetro es null
     */
    public void agregar(Producto p) {
        if (p == null) {
            throw new NullPointerException("No se puede agregar un producto nulo al inventario.");
        }
        listaProductos.add(p);
    }

    /**
     * Muestra todos los productos en el inventario.
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    /**
     * Método principal para demostrar el funcionamiento del inventario.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();


    }
}