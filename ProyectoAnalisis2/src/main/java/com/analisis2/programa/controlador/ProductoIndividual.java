package com.analisis2.programa.controlador;

import com.analisis2.clases.modelo.Producto;

/*
 * @author Juan Diego Arriola
 */
public class ProductoIndividual implements CreadorArreglo {
    
    Producto producto;
    int cantidad;
    
    public ProductoIndividual(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    @Override
    public float getPrecio() {
        return producto.getPrecio() * cantidad;
    } 
    
    public String getNombreProducto()
    {
        return producto.getNombre();
    }

}
