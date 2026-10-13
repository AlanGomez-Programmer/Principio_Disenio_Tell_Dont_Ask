package com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio;

public class ArticuloCarrito {
    private Producto producto;
    private int cantidad;
    
    public ArticuloCarrito(Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    public Producto getProducto(){
        return this.producto;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
}
