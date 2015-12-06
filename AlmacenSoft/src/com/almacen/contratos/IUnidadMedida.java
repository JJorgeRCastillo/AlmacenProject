/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;

import com.almacen.entity.UnidadMedida;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface IUnidadMedida {
        
    // insertar, eliminar, actualizar, buscar, listar
    
    public int insert(int modo, UnidadMedida objUnidadMedida);
    public boolean delete(int modo, UnidadMedida objUnidadMedida);
    public boolean update(int modo, UnidadMedida objUnidadMedida);
    public List<UnidadMedida> listAll();
    public List<UnidadMedida    > search(String descripcion);
    
}
