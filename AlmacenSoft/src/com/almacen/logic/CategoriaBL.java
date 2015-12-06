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
            return CategoriaDAO.instance.insert(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean delete(int modo, Categoria objCategoria) {
        try {
            return CategoriaDAO.instance.delete(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean update(int modo, Categoria objCategoria) {
        try {
            return CategoriaDAO.instance.update(modo, objCategoria);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Categoria> listAll() {
        try {
            return CategoriaDAO.instance.listAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Categoria> search(String descripcion) {
        try {
            return CategoriaDAO.instance.search(descripcion);
        } catch (Exception e) {
            throw e;
        }
    }

}
