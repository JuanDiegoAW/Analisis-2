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
public class Activo implements Cuenta {

    private String nombre; 
    private float monto; 
    
    public Activo(String nom, float valor) {
        this.nombre = nom; 
        this.monto = valor; 
    }

    @Override
    public float getValor() {
        return this.monto; 
    }

    
}
