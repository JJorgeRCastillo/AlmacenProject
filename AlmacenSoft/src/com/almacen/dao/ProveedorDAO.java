/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IProveedor;
import com.almacen.entity.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class ProveedorDAO implements IProveedor{

    public static ProveedorDAO instance = null;

    private ProveedorDAO() {
    }

    public static ProveedorDAO getInstance() {
        if (instance == null) {
            instance = new ProveedorDAO();
        }
        return instance;
    }
    
    @Override
    public int insert(int modo, Proveedor objProveedor) {
        return 0;
    }

    @Override
    public boolean delete(int modo, Proveedor objProveedor) {
    return true;
    }

    @Override
    public boolean update(int modo, Proveedor objProveedor) {
        return true;
    }

    @Override
    public List<Proveedor> listAll() {
        List<Proveedor> lista= new ArrayList<Proveedor>();
     
          return lista;
    }

    @Override
    public List<Proveedor> search(String descripcion) {
        List<Proveedor> lista= new ArrayList<Proveedor>();
        
          return lista;   
    }
    
}
