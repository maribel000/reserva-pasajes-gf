/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services;

import com.reserva.modelo.Cliente;
import com.reserva.modelo.Reserva;
import com.reserva.modelo.Servicio;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author curso
 */
@Remote
public interface ReservaPasaje {

    public List<Servicio> obtenerServicios(
            String lugarO,
            String lugarD,
            String tipoTransporte,
            String empresa,
            Integer numeroAsiento,
            String fechaSalida,
            String horaSalida);
    
    public Reserva reservarPasaje(
            Servicio reservaServicio,
            Cliente pasajero);
}
