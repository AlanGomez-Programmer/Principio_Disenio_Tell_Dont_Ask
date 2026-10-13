package com.alangomez.principio_disenio_tell_dont_ask.SinAplicacionDelPrincipio;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Producto> productos;
    
    public CarritoCompra(Producto producto){
        this.productos = new ArrayList<>();
    }
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "CarritoCompra{" + "productos=" + productos + '}';
    }
}