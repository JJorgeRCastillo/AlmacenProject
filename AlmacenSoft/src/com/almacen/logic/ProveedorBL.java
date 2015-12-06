/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.ProveedorDAO;
import com.almacen.entity.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class ProveedorBL {

    public static ProveedorBL instance = null;

    private ProveedorBL() {
    }

    public static ProveedorBL getInstance() {
        if (instance == null) {
            instance = new ProveedorBL();
        }
        return instance;
    }

    public int insert(int modo, Proveedor objProveedor) {
        try {
            return ProveedorDAO.getInstance().insert(modo, objProveedor);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, Proveedor objProveedor) {
        try {
            return ProveedorDAO.getInstance().delete(modo, objProveedor);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, Proveedor objProveedor) {
        try {
            return ProveedorDAO.getInstance().update(modo, objProveedor);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Proveedor> listAll() {
        try {
            return ProveedorDAO.getInstance().listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Proveedor> search(String descripcion) {
        try {
            return ProveedorDAO.getInstance().search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }
}
