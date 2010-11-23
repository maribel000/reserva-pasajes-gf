/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services;

import com.reserva.modelo.Servicio;
import java.util.List;

/**
 *
 * @author curso
 */
public interface ReservaPasaje {

    public List<Servicio> obtenerServicios(
            String lugarO,
            String lugarD,
            String tipoTransporte,
            String empresa,
            String fechaSalida,
            String horaSalida);
}
