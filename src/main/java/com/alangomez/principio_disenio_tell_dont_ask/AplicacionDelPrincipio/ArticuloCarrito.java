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
    
    public String getNombreProducto(){
        return this.producto.getNombre();
    }
    
    public double getPrecioProducto(){
        return this.producto.getPrecio();
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    // TELL: el artículo calcula su propio subtotal
    public double calcularSubtotal(){
        return this.producto.getPrecio() * this.cantidad;
    }

    @Override
    public String toString() {
        return "ArticuloCarrito{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }
}