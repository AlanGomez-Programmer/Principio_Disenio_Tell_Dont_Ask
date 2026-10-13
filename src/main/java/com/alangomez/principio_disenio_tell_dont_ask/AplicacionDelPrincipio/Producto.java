package com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio;

public abstract class Producto {
    // Se aplica la encapsulaciòn de los datos
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    // TELL: el producto decide su propio descuento
    public void aplicarDescuento(double porcentaje){
        if (this.precio >= 1000) {
            this.precio = this.precio - (this.precio * porcentaje);
        }
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}