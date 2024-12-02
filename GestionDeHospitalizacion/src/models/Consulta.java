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
public class Consulta {
    private int idConsulta;
    private Date fecha,hora;

    public Consulta() {
    }

    public Consulta(int idConsulta, Date fecha, Date hora) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + idConsulta + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}
