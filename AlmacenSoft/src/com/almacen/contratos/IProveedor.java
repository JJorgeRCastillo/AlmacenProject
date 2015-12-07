/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;


import com.almacen.entity.Proveedor;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface IProveedor {
 
    // insertar, eliminar, actualizar, buscar, listar
    
    public int insert(int modo, Proveedor objProveedor);
    public boolean delete(int modo, Proveedor objProveedor);
    public boolean update(int modo, Proveedor objProveedor);
    public List<Proveedor> listAll();
    public List<Proveedor> search(String descripcion);
    public Proveedor searchByRuc(String ruc);
}
