/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analisis2.insercion.modelo;

import com.analisis2.clases.modelo.Cuenta;
import com.analisis2.clases.modelo.CuentaJpaController;
import com.analisis2.clases.modelo.Detallefacturacompra;
import com.analisis2.clases.modelo.DetallefacturacompraJpaController;
import com.analisis2.clases.modelo.EM;
import com.analisis2.clases.modelo.Producto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author crist
 */
public class IncersionCuenta implements IncersionFactura {

    @Override
    public void insertarDatosFactura(Object[] datos) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
        
        EM e = EM.crearEntityManager();
        EntityManager em = e.getEntity();
        TypedQuery<Cuenta> queryCuenta = em.createNamedQuery("Cuenta.findByNombre", Cuenta.class);
        queryCuenta.setParameter("nombre", datos[0]);
        Cuenta c = queryCuenta.getSingleResult();
        Cuenta detalle = new Cuenta();
        detalle.setMonto((int) datos[1]);
        
        
        
        CuentaJpaController facturaController = new CuentaJpaController(emf);
        facturaController.create(detalle);
    }
    
}
