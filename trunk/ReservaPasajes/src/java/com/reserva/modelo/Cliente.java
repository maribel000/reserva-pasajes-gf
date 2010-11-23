/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.reserva.modelo;

/**
 *
 * @author usuario
 */
public class Cliente extends Persona{
    private Number id;
    private String numeroTarjetaCredito;

    /**
     * @return the numeroTarjetaCredito
     */
    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    /**
     * @param numeroTarjetaCredito the numeroTarjetaCredito to set
     */
    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    /**
     * @return the id
     */
    public Number getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Number id) {
        this.id = id;
    }


}
