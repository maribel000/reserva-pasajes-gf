/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

/**
 *
 * @author usuario
 */
public class Lugar {

    private String descripcion;
    private String ciudad;
    private String localidad;
    private String provincia;
    private String pais;

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the Provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param Provincia the Provincia to set
     */
    public void setProvincia(String Provincia) {
        this.provincia = Provincia;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.pais = Pais;
    }
}
