/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.services.impl;

import com.reserva.modelo.Cliente;
import com.reserva.modelo.Reserva;
import com.reserva.modelo.Servicio;
import com.reserva.services.ReservaPasaje;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ReservaPasajeImpl implements ReservaPasaje {

    public List<Servicio> obtenerServicios(String lugarO, String lugarD, String tipoTransporte, String empresa, Integer numeroAsiento, String fechaSalida, String horaSalida) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Reserva reservarPasaje(Servicio reservaServicio, Cliente pasajero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
