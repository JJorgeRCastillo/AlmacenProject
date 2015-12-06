/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;

import com.almacen.entity.Producto;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface IProducto {
        // insertar, eliminar, actualizar, buscar, listar
    
    public int insert(int modo, Producto objProducto);
    public boolean delete(int modo, Producto objProducto);
    public boolean update(int modo, Producto objProducto);
    public List<Producto> listAll();
    public List<Producto> search(String descripcion);

}
