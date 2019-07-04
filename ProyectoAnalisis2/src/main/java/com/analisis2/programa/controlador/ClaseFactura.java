package com.analisis2.programa.controlador;

/*
 * @author Juan Diego Arriola
 */
public class ClaseFactura {
    private float total = 0;
    
    public void actualizar(float cantidad)
    {
        this.total = this.total + cantidad;
    }
    
    public float getTotal()
    {
        return this.total;
    }
}
