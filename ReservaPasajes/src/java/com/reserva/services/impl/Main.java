/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.services.impl;

import com.reserva.dao.ServicioDao;
import com.reserva.dao.ServicioDaoImpl;
import com.reserva.modelo.Servicio;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        ServicioDao serv = new ServicioDaoImpl();

        for (Servicio p : serv.getAll()) {
            System.out.println(p.getEmpresaPrestadora()+" "+p.getPrecio() );

        }
    }
}
