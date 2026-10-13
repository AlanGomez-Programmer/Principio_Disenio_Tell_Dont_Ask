package com.alangomez.principio_disenio_tell_dont_ask;

import com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio.CarritoCompra;
import com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio.Computadora;
import com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio.Producto;
import com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio.Telefono;
import com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio.ArticuloCarrito;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de Sistema sin uso del diseño Tell, Don't Ask
        Producto compu1 = new Computadora("Lenovo Yoga", 1000, "Lenovo");
        Producto telefono1 = new Telefono("Samsung S25 ultra", 5000, "Samsung");
        
        // ASK: el Main le PREGUNTA el precio y DECIDE el descuento por su cuenta
        if (compu1.getPrecio() >= 1000) {
            compu1.setPrecio(compu1.getPrecio() - (compu1.getPrecio() * 0.10));
        }
        // La misma regla se repite para cada producto (duplicación)
        if (telefono1.getPrecio() >= 1000) {
            telefono1.setPrecio(telefono1.getPrecio() - (telefono1.getPrecio() * 0.10));
        }
        
        ArticuloCarrito articulo1 = new ArticuloCarrito(compu1, 2);
        ArticuloCarrito articulo2 = new ArticuloCarrito(telefono1, 1);
        
        // ASK: el Main PREGUNTA producto, precio y cantidad para calcular el subtotal
        double subtotal1 = articulo1.getProducto().getPrecio() * articulo1.getCantidad();
        double subtotal2 = articulo2.getProducto().getPrecio() * articulo2.getCantidad();
        double total = subtotal1 + subtotal2;
        
        CarritoCompra carrito = new CarritoCompra(compu1);
        carrito.addProducto(compu1);
        carrito.addProducto(telefono1);
        
        System.out.println(carrito);
        System.out.println("Total a pagar: " + total);
    }
}