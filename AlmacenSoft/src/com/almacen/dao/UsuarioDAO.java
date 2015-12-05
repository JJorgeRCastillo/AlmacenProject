package com.almacen.dao;

import com.almacen.entity.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author JorgePC
 */
public class UsuarioDAO {

    public static UsuarioDAO instance = null;

    private UsuarioDAO() {

    }

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    public Usuario verificarAcceso(String user, String pass) {
        Usuario objUsuario = null;
        Connection con = ConectionManagerSQL.getConnection();
        try {
            CallableStatement cstm = con.prepareCall("{call sp_IniciarSesion(?,?)}");
            cstm.setString(1, user);
            cstm.setString(2, pass);
            ResultSet rs = cstm.executeQuery();
            if (rs.next()) {
                objUsuario = new Usuario(
                        rs.getInt("idusuario"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        rs.getString("usuario"),
                        rs.getString("clave"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return objUsuario;
    }
    
}
