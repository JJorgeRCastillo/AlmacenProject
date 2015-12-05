package com.almacen.contratos;

import com.almacen.entity.Categoria;
import java.util.List;

/**
 *
 * @author JorgePC
 */
public interface ICategoria {
    
    // insertar, eliminar, actualizar, buscar, listar
    public int insert(Categoria objCategoria);
    public boolean delete(Categoria objCategoria);
    public boolean update(Categoria objCategoria);
    public List<Categoria> listAll();
    public List<Categoria> search(String descripcion);
    
}
