/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services.impl;

import com.reserva.dao.ServicioDao;
import com.reserva.dao.ServicioDaoImpl;
import com.reserva.modelo.Cliente;
import com.reserva.modelo.Reserva;
import com.reserva.modelo.Servicio;
import com.reserva.services.ReservaPasaje;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;
/**
 *
 * @author usuario
 */

@Stateless
@WebService
public class ReservaPasajeImpl implements ReservaPasaje {
/*
    public List<Servicio> obtenerServicios(String lugarO, 
            String lugarD,
            String tipoTransporte,
            String empresa,
            int numeroAsiento,
            String fechaSalida,
            String horaSalida) {

        ServicioDao serv = new ServicioDaoImpl();
        
        return (List<Servicio>) serv.getAll();



    }
  * */

     public List<Servicio> obtenerServicios(){
        ServicioDao serv = new ServicioDaoImpl();

        return (List<Servicio>) serv.getAll();
     }




    public Reserva reservarPasaje(Servicio reservaServicio, Cliente pasajero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
