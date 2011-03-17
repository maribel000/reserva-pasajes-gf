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

public interface ReservaPasaje {

    public List<Servicio> obtenerServicios();
    
    public Reserva reservarPasaje(
            Servicio reservaServicio,
            Cliente pasajero);
}
