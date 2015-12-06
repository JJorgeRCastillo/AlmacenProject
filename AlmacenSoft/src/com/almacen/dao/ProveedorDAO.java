/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IProveedor;
import com.almacen.entity.Categoria;
import com.almacen.entity.Proveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class ProveedorDAO implements IProveedor {

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
        Connection con = ConectionManagerSQL.getConnection();
        int result = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProveedor(?,?,?,?,?,?,?)}"); // int modo, int id, string des
            cstm.setInt(1, modo);
            cstm.setInt(2, 0);
            cstm.setString(3, objProveedor.getRuc());
            cstm.setString(4, objProveedor.getRazonSocial());
            cstm.setString(5, objProveedor.getDireccion());
            cstm.setString(6, objProveedor.getTelefono());
            cstm.setString(7, objProveedor.getNombreContacto());

            result = cstm.executeUpdate();
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, Proveedor objProveedor) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProveedor(?,?,?,?,?,?,?)}"); // int modo, int id, string des
            cstm.setInt(1, modo);
            cstm.setInt(2, objProveedor.getIdProveedor());
            cstm.setString(3, objProveedor.getRuc());
            cstm.setString(4, objProveedor.getRazonSocial());
            cstm.setString(5, objProveedor.getDireccion());
            cstm.setString(6, objProveedor.getTelefono());
            cstm.setString(7, objProveedor.getNombreContacto());
            if (cstm.executeUpdate() == 1) {
                result = true;
            }
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(int modo, Proveedor objProveedor) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProveedor(?,?,?,?,?,?,?)}"); // int modo, int id, string des
            cstm.setInt(1, modo);
            cstm.setInt(2, objProveedor.getIdProveedor());
            cstm.setString(3, objProveedor.getRuc());
            cstm.setString(4, objProveedor.getRazonSocial());
            cstm.setString(5, objProveedor.getDireccion());
            cstm.setString(6, objProveedor.getTelefono());
            cstm.setString(7, objProveedor.getNombreContacto());
            if (cstm.executeUpdate() == 1) {
                result = true;
            }
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Proveedor> listAll() {
        List<Proveedor> lstProveedor = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarProveedor}");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstProveedor.add(new Proveedor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7)
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstProveedor;
    }

    @Override
    public List<Proveedor> search(String descripcion) {
        List<Proveedor> lstProveedor = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_BuscarProveedor(?)}");
            cstm.setString(1, descripcion);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstProveedor.add(new Proveedor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7)
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstProveedor;
    }

}
