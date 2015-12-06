/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.TipoFichaDAO;
import com.almacen.entity.TipoFicha;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class TipoFichaBL {
        public static TipoFichaBL instance = null;

    private TipoFichaBL() {
    }

    public static TipoFichaBL getInstance() {
        if (instance == null) {
            instance = new TipoFichaBL();
        }
        return instance;
    }

    public int insert(int modo, TipoFicha objTipoFicha) {
        try {
            return TipoFichaDAO.instance.insert(modo, objTipoFicha);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, TipoFicha objTipoFicha) {
        try {
            return TipoFichaDAO.instance.delete(modo, objTipoFicha);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, TipoFicha objTipoFicha) {
        try {
            return TipoFichaDAO.instance.update(modo, objTipoFicha);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<TipoFicha> listAll() {
        try {
            return TipoFichaDAO.instance.listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<TipoFicha> search(String descripcion) {
        try {
            return TipoFichaDAO.instance.search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }

}
