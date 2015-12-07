package com.almacen.dao;

import com.almacen.contratos.IUsuario;
import com.almacen.entity.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JorgePC
 */
public class UsuarioDAO implements IUsuario {

    private static UsuarioDAO instance = null;

    private UsuarioDAO() {

    }

    public static UsuarioDAO getInstance() {
        if (instance == null) {
            instance = new UsuarioDAO();
        }
        return instance;
    }

    public Usuario verificarAcceso(String usuario, String clave) {
        Connection con = ConectionManagerSQL.getConnection();
        Usuario objUsuario = null;
        try {
            CallableStatement cstm = con.prepareCall("{call sp_IniciarSesion(?,?)}");
            cstm.setString(1, usuario);
            cstm.setString(2, clave);

            ResultSet rs = cstm.executeQuery();

            if (rs.next()) {
                objUsuario = new Usuario(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return objUsuario;
    }

    @Override
    public int insert(int modo, Usuario objUsuario) {
        return 0;
    }

    @Override
    public boolean delete(int modo, Usuario objUsuario) {
        return true;
    }

    @Override
    public boolean update(int modo, Usuario objUsuario) {
        return true;
    }

    @Override
    public List<Usuario> listAll() {
        List<Usuario> lista = new ArrayList<Usuario>();

        return lista;
    }

    @Override
    public List<Usuario> search(String descripcion) {
        List<Usuario> lista = new ArrayList<Usuario>();

        return lista;
    }

}
