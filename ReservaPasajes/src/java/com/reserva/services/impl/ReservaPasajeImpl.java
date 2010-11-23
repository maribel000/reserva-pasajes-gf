/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services.impl;

import com.reserva.modelo.Asiento;
import com.reserva.modelo.Cliente;
import com.reserva.modelo.Empresa;
import com.reserva.modelo.Itinerario;
import com.reserva.modelo.Lugar;
import com.reserva.modelo.Reserva;
import com.reserva.modelo.Servicio;
import com.reserva.modelo.Transporte;
import com.reserva.services.ReservaPasaje;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author usuario
 */
public class ReservaPasajeImpl implements ReservaPasaje {

    public List<Servicio> obtenerServicios(String lugarO, String lugarD, String tipoTransporte, String empresa, Integer numeroAsiento, String fechaSalida, String horaSalida) {
        List<Servicio> listadoServicios = new ArrayList<Servicio>();
        List<Empresa> empresasPrestatarias = new ArrayList<Empresa>();
        List<Itinerario> itinerariosGenerales = new ArrayList<Itinerario>();
        List<Transporte> vehiculosTransporte = new ArrayList<Transporte>();
        List<Asiento> asientos = new ArrayList<Asiento>();
        int indice = 0;


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

        Itinerario i = new Itinerario();
        i.setOrigen(lugarOrigen);
        i.setDestino(lugarDestino);
        i.setDistanciaKm(700);
        i.setHorarioPartida("08:00");

        itinerariosGenerales.set(1, i);

        Transporte t = new Transporte();
        t.setDescripcion("BOEING 747");
        t.setTipo("AVION JUMBO");

        
        for (Asiento asiento : asientos) {
            indice++;

            asiento.setDisponible("SI");
            asiento.setNumeroAsiento(indice);
            asiento.setUbicacion("PASILLO");

            asientos.add(asiento);
            
        }

        t.setAsientos(asientos);

        Empresa e = new Empresa();

        e.setItinerario(itinerariosGenerales);
        e.setDenominacion("AEROLINEAS ARGENTINAS");
        e.setPrecioPorKm(100.00);
        e.setTipoTransporte("AVION");
        e.setTransportes(vehiculosTransporte);





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
