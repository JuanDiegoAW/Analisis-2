/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventarioloves;

/**
 *
 * @author crist
 */
public class Pasivo implements Cuenta {

     private String nombre; 
    private float monto; 
    
    public Pasivo(String nom, float valor) {
        this.nombre = nom; 
        this.monto = valor; 
    }
     @Override
    public float getValor() {
        return this.monto; 
    }
    public void restarTotal()
    {
        
    }
    
}
