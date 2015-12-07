/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IDetalleKardex;
import com.almacen.entity.DetalleKardex;
import com.almacen.entity.Ficha;
import com.almacen.entity.ListaKardex;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class DetalleKardexDAO implements IDetalleKardex {

    public static DetalleKardexDAO instance = null;

    private DetalleKardexDAO() {
    }

    public static DetalleKardexDAO getInstance() {
        if (instance == null) {
            instance = new DetalleKardexDAO();
        }
        return instance;
    }

    @Override
    public List<ListaKardex> listKardexSalida(int idproducto, String desde, String hasta) {
        Connection con = ConectionManagerSQL.getConnection();
        List<ListaKardex> lstListaKardex = new ArrayList<ListaKardex>();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarKardexSalidas(?,?,?)}");
            cstm.setInt(1, idproducto);
            cstm.setString(2, desde);
            cstm.setString(3, hasta);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                ListaKardex objListaKardex = new ListaKardex(
                        rs.getDate(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getDouble(8));
                lstListaKardex.add(objListaKardex);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstListaKardex;
    }

    @Override
    public List<ListaKardex> listKardexEntrada(int idproducto, String desde, String hasta) {
        Connection con = ConectionManagerSQL.getConnection();
        List<ListaKardex> lstListaKardex = new ArrayList<ListaKardex>();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarKardexEntradas(?,?,?)}");
            cstm.setInt(1, idproducto);
            cstm.setString(2, desde);
            cstm.setString(3, hasta);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                ListaKardex objListaKardex = new ListaKardex(
                        rs.getDate(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getDouble(8));
                lstListaKardex.add(objListaKardex);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstListaKardex;
    }
}
