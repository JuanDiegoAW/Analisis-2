package com.analisis2.clases.modelo;

import com.analisis2.clases.modelo.ArregloHasProducto;
import com.analisis2.clases.modelo.Detallefacturacompra;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.4.v20190115-rNA", date="2019-07-03T17:55:05")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Integer> existencia;
    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile CollectionAttribute<Producto, Detallefacturacompra> detallefacturacompraCollection;
    public static volatile CollectionAttribute<Producto, ArregloHasProducto> arregloHasProductoCollection;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombre;

}