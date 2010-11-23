/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reserva.modelo;

/**
 *
 * @author usuario
 */
public class Persona {
    private Number id;
    private String denominacion;
    private String email;
    private String documento;
    private String tipoDocumento;
    private String sexo;

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
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
