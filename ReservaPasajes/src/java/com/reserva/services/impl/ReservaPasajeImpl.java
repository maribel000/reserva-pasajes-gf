/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.services.impl;

import com.reserva.modelo.Cliente;
import com.reserva.modelo.Empresa;
import com.reserva.modelo.Itinerario;
import com.reserva.modelo.Lugar;
import com.reserva.modelo.Reserva;
import com.reserva.modelo.Servicio;
import com.reserva.services.ReservaPasaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ReservaPasajeImpl implements ReservaPasaje {

    public List<Servicio> obtenerServicios(String lugarO, String lugarD, String tipoTransporte, String empresa, Integer numeroAsiento, String fechaSalida, String horaSalida) {
        List<Servicio> listadoServicios = new ArrayList<Servicio>();
        List<Empresa> empresasPrestatarias = new ArrayList<Empresa>();
        List<Itinerario> itinerariosGenerales = new ArrayList<Itinerario>();

        Lugar lugarOrigen = new Lugar();
        Lugar lugarDestino = new Lugar();

        lugarOrigen.setCiudad("CORDOBA");
        lugarOrigen.setDescripcion("CORDOBA-BUENOS AIRES");
        lugarOrigen.setLocalidad("CAPITAL");
        lugarOrigen.setPais("ARGENTINA");
        lugarOrigen.setProvincia("CORDOBA");

        lugarDestino.setCiudad("BUENOS AIRES");
        lugarDestino.setDescripcion("CORDOBA-BUENOS AIRES");
        lugarDestino.setLocalidad("CAPITAL FEDERAL");
        lugarDestino.setPais("ARGENTINA");
        lugarDestino.setProvincia("BUENOS AIRES");



        for (Itinerario itinerario : itinerariosGenerales) {
            itinerario.setOrigen(lugarOrigen);
            itinerario.setDestino(lugarDestino);
            itinerario.setDistanciaKm(700);
            itinerario.setHorarioPartida("08:00");

            itinerario.setOrigen(lugarOrigen);
            itinerario.setDestino(lugarDestino);
            itinerario.setDistanciaKm(700);
            itinerario.setHorarioPartida("10:00");

            itinerario.setOrigen(lugarOrigen);
            itinerario.setDestino(lugarDestino);
            itinerario.setDistanciaKm(700);
            itinerario.setHorarioPartida("12:00");



        }

/*
        for (Empresa empresa1 : empresasPrestatarias) {
            empresa1.setDenominacion("AEROLINEAS ARGENTINAS");
            empresa1.setItinerario();
            
        }
*/
        return listadoServicios;
        


        
    }

    public Reserva reservarPasaje(Servicio reservaServicio, Cliente pasajero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
