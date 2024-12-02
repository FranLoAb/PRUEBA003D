/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Hospitalizacion {
    private int idHospitalizacion;
    private Date fechaIngreso,fechaAlta;
    private String tipoDeHospitalizacion;

    public Hospitalizacion() {
    }

    public Hospitalizacion(int idHospitalizacion, Date fechaIngreso, Date fechaAlta, String tipoDeHospitalizacion) {
        this.idHospitalizacion = idHospitalizacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaAlta = fechaAlta;
        this.tipoDeHospitalizacion = tipoDeHospitalizacion;
    }

    public int getIdHospitalizacion() {
        return idHospitalizacion;
    }

    public void setIdHospitalizacion(int idHospitalizacion) {
        this.idHospitalizacion = idHospitalizacion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getTipoDeHospitalizacion() {
        return tipoDeHospitalizacion;
    }

    public void setTipoDeHospitalizacion(String tipoDeHospitalizacion) {
        this.tipoDeHospitalizacion = tipoDeHospitalizacion;
    }

    @Override
    public String toString() {
        return "Hospitalizacion{" + "idHospitalizacion=" + idHospitalizacion + ", fechaIngreso=" + fechaIngreso + ", fechaAlta=" + fechaAlta + ", tipoDeHospitalizacion=" + tipoDeHospitalizacion + '}';
    }
    
    
}
