/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.dao;

import com.reserva.modelo.Servicio;
import java.util.List;

/**
 *
 * @author curso
 */

public interface ServicioDao {
    public List <Servicio> obtenerServicios(
            String lugarO,
            String lugarD,
            String tipoTransporte,
            String empresa,
            Integer numeroAsiento,
            String fechaSalida,
            String horaSalida);


}
