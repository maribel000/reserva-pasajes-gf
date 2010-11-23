/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services;

import com.reserva.modelo.Cliente;
import com.reserva.modelo.Reserva;
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
            Number numeroAsiento, //reemplazar por integer
            String fechaSalida,
            String horaSalida);

    public Reserva reservarPasaje(
            Servicio reservaServicio,
            Cliente pasajero);
}
