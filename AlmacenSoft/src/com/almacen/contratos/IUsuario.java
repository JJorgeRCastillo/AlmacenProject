/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;

import com.almacen.entity.Usuario;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface IUsuario {
     // insertar, eliminar, actualizar, buscar, listar, verificar
    
    public int insert(int modo, Usuario objUsuario);
    public boolean delete(int modo, Usuario objUsuario);
    public boolean update(int modo, Usuario objUsuario);
    public List<Usuario> listAll();
    public List<Usuario> search(String descripcion);
   public Usuario verificarAcceso(String usuario, String clave);
}
