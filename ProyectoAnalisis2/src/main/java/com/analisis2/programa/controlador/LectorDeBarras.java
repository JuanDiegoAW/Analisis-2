package com.analisis2.programa.controlador;

import com.analisis2.clases.modelo.Producto;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/*
 * @author Juan Diego Arriola
 */
public class LectorDeBarras {
    private static LectorDeBarras codigo;
    private Producto producto;
    private ClaseFactura facturaObservador;
    
    private LectorDeBarras(){
        facturaObservador = new ClaseFactura();
    }
    
    public static LectorDeBarras crearLector()
    {
        if (codigo == null)
        {
            codigo = new LectorDeBarras();
        }
        return codigo;
    }
    
    public Producto leerCodigo(int codigo)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conexion");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Producto> queryProducto = em.createNamedQuery("Producto.findByIdProducto", Producto.class );
        queryProducto.setParameter("idProducto", codigo);
        producto = queryProducto.getSingleResult();
        
        return producto;
    }
    
    public void notificar(float precio)
    {
        facturaObservador.actualizar(precio);
    }
    
    public ClaseFactura getFactura()
    {
        return this.facturaObservador;
    }
}
