/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.dao;

import com.reserva.modelo.Servicio;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author curso
 */
public class ServicioDaoImpl implements ServicioDao {

    public  List <Servicio> getAll() {

        List<Servicio> list = new ArrayList<Servicio>();

        Servicio s;

        try {


            String sql = "select ser_id , " +
                                "ser_origen, " +
                                "ser_destino , " +
                                "ser_empresa_prestadora , " +
                                "ser_numero_asiento , " +
                                "ser_hora_salida, " +
                                "ser_fecha_salida , " +
                                "ser_descr_tipo_serv , " +
                                "ser_precio  " +
                                "from app.servicios";
            Conexion c = Conexion.get();
            ResultSet rs = c.getResultSet(sql);
            while(rs.next()){
                s = new Servicio();
                s.setId(                        rs.getInt("ser_id"));
                s.setDescripcionTipoServicio(   rs.getString("ser_descr_tipo_serv"));
                s.setDestino(                   rs.getString("ser_destino"));
                s.setEmpresaPrestadora(         rs.getString("ser_empresa_prestadora"));
                s.setFechaSalida(               rs.getString("ser_fecha_salida"));
                s.setHoraSalida(                rs.getString("ser_hora_salida"));
                s.setNumeroAsiento(             rs.getInt("ser_numero_asiento"));
                s.setOrigen(                    rs.getString("ser_origen"));
                s.setPrecio(                    rs.getFloat("ser_precio"));


                 list.add(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return (List<Servicio>) list;




    }

}
