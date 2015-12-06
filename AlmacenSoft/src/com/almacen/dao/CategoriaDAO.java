package com.almacen.dao;

import com.almacen.contratos.ICategoria;
import com.almacen.entity.Categoria;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JorgePC
 */
public class CategoriaDAO implements ICategoria {

    public static CategoriaDAO instance = null;

    private CategoriaDAO() {
    }

    public static CategoriaDAO getInstance() {
        if (instance == null) {
            instance = new CategoriaDAO();
        }
        return instance;
    }

    @Override
    public int insert(int modo, Categoria objCategoria) {
        Connection con = ConectionManagerSQL.getConnection();
        int result = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDCategoria(?,?,?)}"); // int modo, int id, string des
            cstm.setString(1, "1");
            cstm.setInt(2, 0);
            cstm.setString(3, objCategoria.getDescripcion());
            ResultSet rs = cstm.executeQuery();
            if (rs.next()) {
                result = rs.getInt(1); // result
            }
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, Categoria objCategoria) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDCategoria(?,?,?)}");
            cstm.setString(1, "3");
            cstm.setInt(2, objCategoria.getIdCategoria());
            cstm.setString(3, "");
            cstm.execute();
            result = true;
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean update(int modo, Categoria objCategoria) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean result = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDCategoria(?,?,?)}");
            cstm.setString(1, "2");
            cstm.setInt(2, objCategoria.getIdCategoria());
            cstm.setString(3, objCategoria.getDescripcion());
            cstm.execute();
            result = true;
            cstm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Categoria> listAll() {
        List<Categoria> lstCategoria = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarCategoria}");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstCategoria.add(new Categoria(
                        rs.getInt(1),
                        rs.getString(2),
                        true));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstCategoria;
    }

    @Override
    public List<Categoria> search(String descripcion) {
        List<Categoria> lstCategoria = new ArrayList<>();
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_BuscarCategoria(?)}");
            cstm.setString(1, descripcion);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                lstCategoria.add(new Categoria(rs.getInt(1),
                        rs.getString(2),
                        true));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstCategoria;
    }

}
