/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IProducto;
import com.almacen.entity.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class ProductoDAO implements IProducto{

    public static ProductoDAO instance = null;

    private ProductoDAO() {
    }

    public static ProductoDAO getInstance() {
        if (instance == null) {
            instance = new ProductoDAO();
        }
        return instance;
    }
    
    @Override
    public int insert(int modo, Producto objProducto) {
        Connection con = ConectionManagerSQL.getConnection();
        int result = 0;
        try{
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProducto(?,?,?,?,?,?,?,?,?,?) }");
            cstm.setInt(1, modo);
      
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, Producto objProducto) {
        return true;
    }

    @Override
    public boolean update(int modo, Producto objProducto) {
        return true;
    }

    @Override
    public List<Producto> listAll() {
        List<Producto> lista = new ArrayList<Producto>();
        
        return lista;
    }

    @Override
    public List<Producto> search(String descripcion) {
        List<Producto> lista = new ArrayList<Producto>();
        
        return lista;
    }
    
}
