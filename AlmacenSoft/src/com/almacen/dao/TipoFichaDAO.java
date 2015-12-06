/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.dao;

import com.almacen.contratos.ITipoFicha;
import com.almacen.entity.TipoFicha;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public class TipoFichaDAO implements ITipoFicha{

    public static TipoFichaDAO instance = null;

    private TipoFichaDAO() {
    }

    public static TipoFichaDAO getInstance() {
        if (instance == null) {
            instance = new TipoFichaDAO();
        }
        return instance;
    }
    
    
    @Override
    public int insert(int modo, TipoFicha objTipoFicha) {
       return 0;
    }

    @Override
    public boolean delete(int modo, TipoFicha objTipoFicha) {
        return true;
    }

    @Override
    public boolean update(int modo, TipoFicha objTipoFicha) {
        return true;
    }

    @Override
    public List<TipoFicha> listAll() {
        List<TipoFicha> lista= new ArrayList<TipoFicha>();
        
        return lista; 
    }

    @Override
    public List<TipoFicha> search(String descripcion) {
        List<TipoFicha> lista= new ArrayList<TipoFicha>();
        
        return lista;
    }
    
}
