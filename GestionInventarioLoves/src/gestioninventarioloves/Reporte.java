/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventarioloves;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Reporte {
    private float total; 
    private float activo;
    private float pasivo; 
    private float capital; 
    private int mes; 
    private FabricaCuenta fabrica; 
    private ArrayList <Cuenta> cuentas;

    public Reporte() {
    }
    
    public void CrearCuenta(int tipo, String nombre, float valor)
    {
        cuentas.add(fabrica.NuevaCuenta(tipo, nombre, valor));
    }

    public float getCapital() {
        return activo - pasivo;
    }
    public float getActivo() {
        return activo;
    }

    public void setActivo(float activo) {
        this.activo = activo;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    
    
}
