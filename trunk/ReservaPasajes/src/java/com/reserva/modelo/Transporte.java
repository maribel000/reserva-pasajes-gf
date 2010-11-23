/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

import java.util.List;

/**
 *
 * @author curso
 */
public class Transporte extends Vehiculo {

    private List<Asiento> asientos;

    /**
     * @return the asientos
     */
    public List<Asiento> getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }
}
