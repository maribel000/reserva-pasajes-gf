/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

/**
 *
 * @author usuario
 */
public class Itinerario {
    
    private Lugar origen;
    private Lugar destino;
    private String horarioPartida;
    private Integer distanciaKm;

    /**
     * @return the origen
     */
    public Lugar getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public Lugar getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

   
    /**
     * @return the horarioPartida
     */
    public String getHorarioPartida() {
        return horarioPartida;
    }

    /**
     * @param horarioPartida the horarioPartida to set
     */
    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    /**
     * @return the distanciaKm
     */
    public Integer getDistanciaKm() {
        return distanciaKm;
    }

    /**
     * @param distanciaKm the distanciaKm to set
     */
    public void setDistanciaKm(Integer distanciaKm) {
        this.distanciaKm = distanciaKm;
    }


}
