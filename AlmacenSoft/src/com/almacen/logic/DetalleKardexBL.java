/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.DetalleKardexDAO;
import com.almacen.entity.ListaKardex;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class DetalleKardexBL {

    public static DetalleKardexBL instance = null;

    private DetalleKardexBL() {
    }

    public static DetalleKardexBL getInstance() {
        if (instance == null) {
            instance = new DetalleKardexBL();
        }
        return instance;
    }

    public List<ListaKardex> listKardexSalida(int idproducto, String desde, String hasta) {
        try {
            return DetalleKardexDAO.getInstance().listKardexSalida(idproducto,desde, hasta);
        } catch (Exception e) {
            throw e;
        }
    }
    public List<ListaKardex> listKardexEntrada(int idproducto, String desde, String hasta) {
        try {
            return DetalleKardexDAO.getInstance().listKardexEntrada(idproducto,desde, hasta);
        } catch (Exception e) {
            throw e;
        }
    }
}
