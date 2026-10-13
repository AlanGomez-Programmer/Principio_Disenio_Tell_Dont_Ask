package com.alangomez.principio_disenio_tell_dont_ask;
import com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio.*;

public class Main2 {
    public static void main(String[] args) {
        // Ejemplo de Sistema con uso del diseño Tell, Don't Ask
        Producto compu1 = new Computadora("Lenovo Yoga", 1000, "Lenovo");
        Producto telefono1 = new Telefono("Samsung S25 ultra", 5000, "Samsung");
        
        //TELL: se le DICE al producto que aplique su descuento
        compu1.aplicarDescuento(0.10);
        telefono1.aplicarDescuento(0.10); 
        
        ArticuloCarrito articulo1 = new ArticuloCarrito(compu1, 2);
        ArticuloCarrito articulo2 = new ArticuloCarrito(telefono1, 1);
        
        CarritoCompra carrito = new CarritoCompra();
        carrito.addProducto(articulo1);
        carrito.addProducto(articulo2);
        
        // TELL: se le DICE al carrito que muestre sus productos
        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();
        double total = carrito.obtenerTotal();
        System.out.println("Total: " + total);
    }
}

