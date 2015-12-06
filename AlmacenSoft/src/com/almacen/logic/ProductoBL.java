/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.ProductoDAO;
import com.almacen.entity.Producto;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class ProductoBL {
     public static ProductoBL instance = null;

    private ProductoBL() {
    }

    public static ProductoBL getInstance() {
        if (instance == null) {
            instance = new ProductoBL();
        }
        return instance;
    }

    public int insert(int modo, Producto objProducto) {
        try {
            return ProductoDAO.getInstance().insert(modo, objProducto);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, Producto objProducto) {
        try {
            return ProductoDAO.getInstance().delete(modo, objProducto);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, Producto objProducto) {
        try {
            return ProductoDAO.getInstance().update(modo, objProducto);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Producto> listAll() {
        try {
            return ProductoDAO.getInstance().listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Producto> search(String descripcion) {
        try {
            return ProductoDAO.getInstance().search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }
   
}
