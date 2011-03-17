/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

/**
 *
 * @author curso
 */
public class Reserva  {

    private Integer id;
    private String estado;
    private Servicio servicioReservado;
    private Cliente clienteContratante;



    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the servicioReservado
     */
    public Servicio getServicioReservado() {
        return servicioReservado;
    }

    /**
     * @param servicioReservado the servicioReservado to set
     */
    public void setServicioReservado(Servicio servicioReservado) {
        this.servicioReservado = servicioReservado;
    }

    /**
     * @return the clienteContratante
     */
    public Cliente getClienteContratante() {
        return clienteContratante;
    }

    /**
     * @param clienteContratante the clienteContratante to set
     */
    public void setClienteContratante(Cliente clienteContratante) {
        this.clienteContratante = clienteContratante;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
}
