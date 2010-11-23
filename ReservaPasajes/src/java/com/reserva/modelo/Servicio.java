/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

/**
 *
 * @author usuario
 * 
 */
public class Servicio {
    private Number id;
    private String origen;
    private String destino;
    private String empresaPrestadora;
    private Integer numeroAsiento;
    private String horaSalida;
    private String fechaSalida;
    private String descripcionTipoServicio;
    private Number precio;

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

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the empresaPrestadora
     */
    public String getEmpresaPrestadora() {
        return empresaPrestadora;
    }

    /**
     * @param empresaPrestadora the empresaPrestadora to set
     */
    public void setEmpresaPrestadora(String empresaPrestadora) {
        this.empresaPrestadora = empresaPrestadora;
    }

    /**
     * @return the numeroAsiento
     */
    public Integer getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * @param numeroAsiento the numeroAsiento to set
     */
    public void setNumeroAsiento(Integer numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the descripcionTipoServicio
     */
    public String getDescripcionTipoServicio() {
        return descripcionTipoServicio;
    }

    /**
     * @param descripcionTipoServicio the descripcionTipoServicio to set
     */
    public void setDescripcionTipoServicio(String descripcionTipoServicio) {
        this.descripcionTipoServicio = descripcionTipoServicio;
    }

    /**
     * @return the precio
     */
    public Number getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    

   
    
}
