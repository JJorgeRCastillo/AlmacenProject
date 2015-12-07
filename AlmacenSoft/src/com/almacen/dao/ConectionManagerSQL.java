package com.almacen.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JorgePC
 */
public class ConectionManagerSQL {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:191.237.9.181://localhost:1433;" + "databaseName=AlmacenDB", "almacen", "123almacen");
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
