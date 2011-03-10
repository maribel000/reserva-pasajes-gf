/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.dao;

/**
 *
 * @author curso
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author curso
 */
public class Conexion {

    private static Conexion c;
    private static Connection conn;

    private Conexion ()    {
        try {
            String url = "jdbc:derby://localhost:1527/reserva";
            String up = "admin";
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();


            conn = DriverManager.getConnection(url, up, up);
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Conexion get(){
        if(c == null){
            c = new Conexion();
        }


        return c;
    }


 public ResultSet getResultSet(String sql) throws SQLException {
        PreparedStatement pstmt = null;
        pstmt = conn.prepareStatement(sql.toString());
        pstmt.executeQuery();
        return pstmt.getResultSet();
    }


}

