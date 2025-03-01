package Inventario;

/**
 * Representa un producto en el inventario con nombre, precio y stock.
 * 
 * @author T0my
 * @version 1.0.7
 * @since 28/02/2025
 */
public class Producto {
    
/**
 * Crea un producto al pasarle los parámetros nombre, precio y stock
 * 
 * @param nombre String para el nombre del producto
 * @param precio decimal que indica el precio del producto
 * @param stock número entero que indica el número de unidades de dicho producto en el inventario
 * @return devuelve un objeto producto inicializado con los valores introducidos
 * @throws IllegalArgumentException Si el precio es menor o igual a cero o si el stock es negativo
 */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        return new Producto(nombre, precio, stock);
    }
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Método que obtiene el nombre del producto
     * 
     * @return devuelve el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto
     * 
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que obtiene el precio del producto
     * 
     * @return devuelve el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto
     * 
     * @param precio El nuevo precio del producto
     * @throws IllegalArgumentException Si el precio es menor o igual a cero
     */
    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        this.precio = precio;
    }

    /**
     * Método que obtiene el stock del producto
     * 
     * @return Devuelve el stock del producto
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del producto
     * 
     * @param stock El nuevo stock del producto
     * @throws IllegalArgumentException Si el stock es negativo
     */
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }

    /**
     * Constructor privado para inicializar un producto
     * 
     * @param nombre El nombre del producto
     * @param precio El precio del producto
     * @param stock  Cantidad del producto disponibñe en el inventario
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra la información del producto por consola
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

}