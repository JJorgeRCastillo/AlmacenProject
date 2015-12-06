/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IUnidadMedida;
import com.almacen.entity.UnidadMedida;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class UnidadMedidaDAO implements IUnidadMedida {

    private static UnidadMedidaDAO instance = null;

    private UnidadMedidaDAO() {
    }

    public static UnidadMedidaDAO getInstance() {
        if (instance == null) {
            instance = new UnidadMedidaDAO();
        }
        return instance;
    }

    @Override
    public int insert(int modo, UnidadMedida objUnidadMedida) {
        Connection con = ConectionManagerSQL.getConnection();
        int result = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDUnidadMedida(?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, 0);
            cstm.setString(3, objUnidadMedida.getDescripcion());
            cstm.setString(4, objUnidadMedida.getSimbolo());

            result = cstm.executeUpdate();
            cstm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, UnidadMedida objUnidadMedida) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean ok = false;
        try{
            CallableStatement cstm = con.prepareCall("{call sp_CRUDUnidadMedida(?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, objUnidadMedida.getIdUnidadMedida());
            cstm.setString(3, "");
            cstm.setString(4, "");
            
            int result = cstm.executeUpdate();
            
            if(result > 0){
                ok = true;
            }
            
            cstm.close();
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public boolean update(int modo, UnidadMedida objUnidadMedida) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean ok = false;
        try{
            CallableStatement cstm = con.prepareCall("{call sp_CRUDUnidadMedida(?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2,objUnidadMedida.getIdUnidadMedida());
            cstm.setString(3, objUnidadMedida.getDescripcion());
            cstm.setString(4, objUnidadMedida.getSimbolo());
            
            int result = cstm.executeUpdate();
            
            if(result > 0){
                ok = true;
            }
            
            cstm.close();
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<UnidadMedida> listAll() {
        Connection con = ConectionManagerSQL.getConnection();
        List<UnidadMedida> lstUnidadMedia = new ArrayList<UnidadMedida>();
        try{
            CallableStatement cstm = con.prepareCall("{call sp_ListarUnidadMedida}");
            ResultSet rs = cstm.executeQuery();
            while(rs.next()){
                UnidadMedida objUnidadMedida = new UnidadMedida(
                             rs.getInt(1),
                             rs.getString(2), 
                             rs.getString(3),
                             rs.getBoolean(4));
                lstUnidadMedia.add(objUnidadMedida);
            }
            cstm.close();
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lstUnidadMedia;
    }

    @Override
    public List<UnidadMedida> search(String descripcion) {
        List<UnidadMedida> lista = new ArrayList<UnidadMedida>();

        return lista;
    }

}
