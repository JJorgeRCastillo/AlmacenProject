/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.logic;

import com.almacen.dao.ConectionManagerSQL;
import com.almacen.dao.UsuarioDAO;
import com.almacen.entity.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author JorgePC
 */
public class UsuarioBL {

    private static UsuarioBL instance = null;

    private UsuarioBL() {

    }

    public static UsuarioBL getInstance() {
        if (instance == null) {
            instance = new UsuarioBL();
        }
        return instance;
    }

    public Usuario verficarAcceso(String usuario, String clave) {
        try {
            return UsuarioDAO.getInstance().verificarAcceso(usuario, clave);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
    