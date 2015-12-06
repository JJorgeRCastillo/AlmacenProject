/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.CategoriaDAO;
import com.almacen.entity.Categoria;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class CategoriaBL {

    public static CategoriaBL instance = null;

    private CategoriaBL() {
    }

    public static CategoriaBL getInstance() {
        if (instance == null) {
            instance = new CategoriaBL();
        }
        return instance;
    }

    public int insert(int modo, Categoria objCategoria) {
        try {
            return CategoriaDAO.getInstance().insert(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, Categoria objCategoria) {
        try {
            return CategoriaDAO.getInstance().delete(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, Categoria objCategoria) {
        try {
            return CategoriaDAO.getInstance().update(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Categoria> listAll() {
        try {
            return CategoriaDAO.getInstance().listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Categoria> search(String descripcion) {
        try {
            return CategoriaDAO.getInstance().search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }

}
