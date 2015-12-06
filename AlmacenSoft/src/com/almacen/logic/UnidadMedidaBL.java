/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.UnidadMedidaDAO;
import com.almacen.entity.UnidadMedida;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class UnidadMedidaBL {

    private static UnidadMedidaBL instance = null;

    private UnidadMedidaBL() {
    }

    public static UnidadMedidaBL getInstance() {
        if (instance == null) {
            instance = new UnidadMedidaBL();
        }
        return instance;
    }

    public int insert(int modo, UnidadMedida objUnidadMedida) {
        try {
            return UnidadMedidaDAO.getInstance().insert(modo, objUnidadMedida);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, UnidadMedida objUnidadMedida) {
        try {
            return UnidadMedidaDAO.getInstance().delete(modo, objUnidadMedida);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, UnidadMedida objUnidadMedida) {
        try {
            return UnidadMedidaDAO.getInstance().update(modo, objUnidadMedida);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<UnidadMedida> listAll() {
        try {
            return UnidadMedidaDAO.getInstance().listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<UnidadMedida> search(String descripcion) {
        try {
            return UnidadMedidaDAO.getInstance().search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }

}
