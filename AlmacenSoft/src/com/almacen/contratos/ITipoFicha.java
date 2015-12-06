/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;

import com.almacen.entity.TipoFicha;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface ITipoFicha {
    // insertar, eliminar, actualizar, buscar, listar
    
    public int insert(int modo, TipoFicha objTipoFicha);
    public boolean delete(int modo, TipoFicha objTipoFicha);
    public boolean update(int modo, TipoFicha objTipoFicha);
    public List<TipoFicha> listAll();
    public List<TipoFicha> search(String descripcion);
}
