/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

import java.util.List;

/**
 *
 * @author usuario
 */
public class Empresa extends Persona {


    private String tipoTransporte;
    private List<Itinerario> itinerario;
    private Double precioPorKm;
    private List<Transporte> transportes;



    /**
     * @return the tipoTransporte
     */
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    /**
     * @param tipoTransporte the tipoTransporte to set
     */
    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    /**
     * @return the itinerario
     */
    public List<Itinerario> getItinerario() {
        return itinerario;
    }

    /**
     * @param itinerario the itinerario to set
     */
    public void setItinerario(List<Itinerario> itinerario) {
        this.itinerario = itinerario;
    }

    /**
     * @return the precioPorKm
     */
    public Double getPrecioPorKm() {
        return precioPorKm;
    }

    /**
     * @param precioPorKm the precioPorKm to set
     */
    public void setPrecioPorKm(Double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }

    /**
     * @return the transportes
     */
    public List<Transporte> getTransportes() {
        return transportes;
    }

    /**
     * @param transportes the transportes to set
     */
    public void setTransportes(List<Transporte> transportes) {
        this.transportes = transportes;
    }
}
