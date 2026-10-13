package com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<ArticuloCarrito> productos;
    
    public CarritoCompra(){
        this.productos = new ArrayList<>();
    }
    
    public void addProducto(ArticuloCarrito producto){
        productos.add(producto);
    }
    
    // TELL: el carrito recorre y muestra sus propios productos
    public void mostrarProductos(){
        for (ArticuloCarrito producto : productos){
            System.out.printf("-> Nombre: %s %n", producto.getNombreProducto());
            System.out.printf("   Precio: %.2f %n", producto.getPrecioProducto());
        }
    }
    
    // Tell: el carrito recorre y muestra el total
    public double obtenerTotal(){
        double total = 0;
        for (ArticuloCarrito producto : productos){
            total += producto.getPrecioProducto() * producto.getCantidad();
        }
        
        return total;
    }

    @Override
    public String toString() {
        return "CarritoCompra{" + "productos=" + productos + '}';
    }
}