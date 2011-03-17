/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.dao;

import com.reserva.modelo.Reserva;

/**
 *
 * @author curso
 */
public interface ReservaDao {
    public Integer registrar(Integer Id, String estado, Integer servicioid, Integer clienteid  );
    

}
