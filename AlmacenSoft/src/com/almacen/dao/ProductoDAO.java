package com.almacen.dao;

import com.almacen.contratos.IProducto;
import com.almacen.entity.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author JOSEPH
 */
public class ProductoDAO implements IProducto{

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
        try{
            CallableStatement cstm = con.prepareCall("{call sp_CRUDProducto(?,?,?,?,?,?,?,?,?,?)}");
            cstm.setInt(1, modo);
            cstm.setInt(2, 0);
            cstm.setInt(3, 0);
            cstm.setInt(4, 0);
            cstm.setString(5, objProducto.getCodigo());
            cstm.setString(6, objProducto.getNombre());
            cstm.setInt(7, objProducto.getStock());
            cstm.setInt(8, objProducto.getValorMaximo());
            cstm.setInt(8, objProducto.getValorMedio());
            cstm.setInt(9, objProducto.getValorMinimo());
            
            ResultSet rs = cstm.executeQuery();
            
            if(rs.next()){
                result  = rs.getInt(1);
            }
            
            cstm.close();
            con.close();
            
            
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
