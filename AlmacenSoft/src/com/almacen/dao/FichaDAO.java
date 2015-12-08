/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IFicha;
import com.almacen.entity.DetalleFicha;
import com.almacen.entity.Ficha;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.text.SimpleDateFormat;

/**
 *
 * @author JorgePC
 */
public class FichaDAO implements IFicha {

    private static FichaDAO instance = null;

    private FichaDAO() {

    }

    public static FichaDAO getInstance() {
        if (instance == null) {
            instance = new FichaDAO();
        }
        return instance;
    }

    @Override
    public int insert(Ficha objFicha) {
        Connection con = ConectionManagerSQL.getConnection();
        Ficha regFicha = null;
        int result = 0;
        try {
            regFicha = insertCabecera(objFicha, con);

            if (regFicha != null) {
                result = insertDetalleFicha(regFicha, con);
            }
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public Ficha insertCabecera(Ficha objFicha, Connection con) {
        Ficha temFicha = null;
        int resultado = 0;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_RegistrarFicha(?,?,?,?,?,?,?,?,?,?)}");
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            cstm.registerOutParameter(1, java.sql.Types.INTEGER);
            cstm.setInt(2, objFicha.getObjTipoFicha().getIdTipoFicha());
            cstm.setInt(3, objFicha.getObjProveedor().getIdProveedor());
            cstm.setString(4, objFicha.getSerie());
            cstm.setString(5, objFicha.getCodigo());
            cstm.setString(6, formato.format(objFicha.getFechaEmision()));
            cstm.setString(7, objFicha.getTipoPago());
            cstm.setString(8, objFicha.getDocumentoReferencia());
            cstm.setFloat(9, objFicha.getMontoTotal());
            cstm.setString(10, objFicha.getMovimiento());

            resultado = cstm.executeUpdate();

            if (resultado > 0) {
                temFicha = new Ficha();
                temFicha.setLstDetalleFicha(objFicha.getLstDetalleFicha());
                temFicha.setIdFicha(cstm.getInt(1));
            }

            cstm.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return temFicha;
    }

    public int insertDetalleFicha(Ficha objFicha, Connection con) {
        int resultado = 0;
        try {
            for (DetalleFicha o : objFicha.getLstDetalleFicha()) {
                CallableStatement cstm = con.prepareCall("{call sp_RegistrarDetalleFicha(?,?,?,?)}");
                cstm.setInt(1, objFicha.getIdFicha());
                cstm.setInt(2, o.getObjProducto().getIdProducto());
                cstm.setInt(3, o.getCantidad()); 
                cstm.setFloat(4, o.getPrecio());

                cstm.executeUpdate();
                cstm.close();
            }
            
            resultado = 1;
               
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
}
