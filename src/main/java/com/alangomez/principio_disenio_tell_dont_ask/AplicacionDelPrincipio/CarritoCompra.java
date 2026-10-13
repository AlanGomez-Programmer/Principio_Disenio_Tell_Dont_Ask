package com.alangomez.principio_disenio_tell_dont_ask.AplicacionDelPrincipio;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private List<Producto> productos = new ArrayList<>();
    
    public CarritoCompra(){
    }
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }
}
