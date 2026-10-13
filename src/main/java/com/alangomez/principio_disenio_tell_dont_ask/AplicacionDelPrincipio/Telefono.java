package com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio;

public class Telefono extends Producto{
    private String nombreMarca;
    
    public Telefono(String nombre, double precio, String nombreMarca){
        super(nombre, precio);
        this.nombreMarca = nombreMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    @Override
    public String toString() {
        return "Computadora{" + "nombre=" + super.getNombre() + " precio=" + super.getPrecio() + "nombreMarca=" + nombreMarca + '}';
    }
}
