/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.IUnidadMedida;
import com.almacen.entity.UnidadMedida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class UnidadMedidaDAO implements IUnidadMedida{

    public static UnidadMedidaDAO instance = null;

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
        return 0;
    }

    @Override
    public boolean delete(int modo, UnidadMedida objUnidadMedida) {
        return true;
    }

    @Override
    public boolean update(int modo, UnidadMedida objUnidadMedida) {
        return true;
    }

    @Override
    public List<UnidadMedida> listAll() {
        List<UnidadMedida> lista= new ArrayList<UnidadMedida>();
        
        return lista;
    }

    @Override
    public List<UnidadMedida> search(String descripcion) {
        List<UnidadMedida> lista= new ArrayList<UnidadMedida>();
        
        return lista;
    }
    
}
