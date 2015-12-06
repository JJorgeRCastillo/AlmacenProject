/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.ITipoFicha;
import com.almacen.entity.TipoFicha;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class TipoFichaDAO implements ITipoFicha {

    public static TipoFichaDAO instance = null;

    private TipoFichaDAO() {
    }

    public static TipoFichaDAO getInstance() {
        if (instance == null) {
            instance = new TipoFichaDAO();
        }
        return instance;
    }

    @Override
    public int insert(int modo, TipoFicha objTipoFicha) {
        Connection con = ConectionManagerSQL.getConnection();
        int result = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDTipoFicha(?,?,?)}"); // int modo, int id, string des
            cstm.setInt(1, modo);
            cstm.setInt(2, 0);
            cstm.setString(3, objTipoFicha.getDescripcion());
            result = cstm.executeUpdate();
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, TipoFicha objTipoFicha) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDTipoFicha(?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, objTipoFicha.getIdTipoFicha());
            cstm.setString(3, "");
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
    public boolean update(int modo, TipoFicha objTipoFicha) {
         Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDTipoFicha(?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, objTipoFicha.getIdTipoFicha());
            cstm.setString(3, objTipoFicha.getDescripcion());
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
    public List<TipoFicha> listAll() {
        List<TipoFicha> lstTipoFicha = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarTipoFicha}");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstTipoFicha.add(new TipoFicha(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3)
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstTipoFicha;
    }

    @Override
    public List<TipoFicha> search(String descripcion) {
    List<TipoFicha> lstTipoFicha = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_BuscarTipoFicha(?)}");
            cstm.setString(1, descripcion);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstTipoFicha.add(new TipoFicha(rs.getInt(1),
                        rs.getString(2),
                        rs.getBoolean(3)));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstTipoFicha;
    }

}
