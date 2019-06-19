/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioninventarioloves;

import static gestioninventarioloves.TiposdeCuenta.ACTIVO;
import static gestioninventarioloves.TiposdeCuenta.PASIVO;

/**
 *
 * @author crist
 */
public class FabricaCuenta {
    private Cuenta nueva; 
    public FabricaCuenta() {
    }
    public Cuenta NuevaCuenta(int tipo, String nombre, float valor)
    {
        if (tipo == ACTIVO)
        {
            this.nueva = new Activo(nombre, valor); 
        }
        if (tipo == PASIVO)
        {
            this.nueva = new Pasivo(nombre, valor); 
        }
        return this.nueva; 
    }
    
}
