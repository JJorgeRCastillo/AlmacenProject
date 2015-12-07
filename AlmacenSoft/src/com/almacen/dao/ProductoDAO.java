package com.almacen.dao;

import com.almacen.contratos.IProducto;
import com.almacen.entity.Categoria;
import com.almacen.entity.Producto;
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
public class ProductoDAO implements IProducto {

    private static ProductoDAO instance = null;

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
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProducto(?,?,?,?,?,?,?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, 0);
            cstm.setInt(3, objProducto.getObjCategoria().getIdCategoria());
            cstm.setInt(4, objProducto.getObjUnidadMedida().getIdUnidadMedida());
            cstm.setString(5, "");
            cstm.setString(6, objProducto.getNombre());
            cstm.setInt(7, objProducto.getStock());
            cstm.setInt(8, objProducto.getValorMaximo());
            cstm.setInt(9, objProducto.getValorMedio());
            cstm.setInt(10, objProducto.getValorMinimo());

            result = cstm.executeUpdate();

            cstm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int modo, Producto objProducto) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean ok = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProducto(?,?,?,?,?,?,?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, objProducto.getIdProducto());
            cstm.setInt(3, 0);
            cstm.setInt(4, 0);
            cstm.setString(5, "");
            cstm.setString(6, "");
            cstm.setInt(7, 0);
            cstm.setInt(8, 0);
            cstm.setInt(9, 0);
            cstm.setInt(10, 0);

            int result = cstm.executeUpdate();

            if (result > 0) {
                ok = true;
            }

            cstm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public boolean update(int modo, Producto objProducto) {
        Connection con = ConectionManagerSQL.getConnection();
        boolean ok = false;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProducto(?,?,?,?,?,?,?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, objProducto.getIdProducto());
            cstm.setInt(3, objProducto.getObjCategoria().getIdCategoria());
            cstm.setInt(4, objProducto.getObjUnidadMedida().getIdUnidadMedida());
            cstm.setString(5, objProducto.getCodigo());
            cstm.setString(6, objProducto.getNombre());
            cstm.setInt(7, objProducto.getStock());
            cstm.setInt(8, objProducto.getValorMaximo());
            cstm.setInt(9, objProducto.getValorMedio());
            cstm.setInt(10, objProducto.getValorMinimo());

            int result = cstm.executeUpdate();

            if (result > 0) {
                ok = true;
            }

            cstm.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Producto> listAll() {
        Connection con = ConectionManagerSQL.getConnection();
        List<Producto> lstProductos = new ArrayList<Producto>();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_ListarProducto}");
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                Producto objProducto = new Producto(
                        rs.getInt(1), rs.getString(7),
                        rs.getString(6), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10),
                        rs.getInt(11), new UnidadMedida(rs.getInt(4), rs.getString(5), "", true),
                        new Categoria(rs.getInt(2), rs.getString(3), true), true);

                lstProductos.add(objProducto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstProductos;
    }

    @Override
    public List<Producto> search(String descripcion) {
        Connection con = ConectionManagerSQL.getConnection();
        List<Producto> lstProductos = new ArrayList<Producto>();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_BuscarProducto(?)}");
            cstm.setString(1, descripcion);
            ResultSet rs = cstm.executeQuery();
            while (rs.next()) {
                Producto objProducto = new Producto(
                        rs.getInt(1), rs.getString(7),
                        rs.getString(6), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10),
                        rs.getInt(11), new UnidadMedida(rs.getInt(4), rs.getString(5), "", true),
                        new Categoria(rs.getInt(2), rs.getString(3), true), true);

                lstProductos.add(objProducto);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lstProductos;
    }

    @Override
    public Producto searchByCodigo(String codigo) {
        Connection con = ConectionManagerSQL.getConnection();
        Producto objProducto = null;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_BuscarProductoByCode(?)}");
            cstm.setString(1, codigo);

            ResultSet rs = cstm.executeQuery();

            if (rs.next()) {
                objProducto = new Producto(rs.getInt(1), rs.getString(3), rs.getString(2), rs.getInt(4), 0, 0, 0, new UnidadMedida(), new Categoria(), rs.getBoolean(5));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return objProducto;
    }

}
