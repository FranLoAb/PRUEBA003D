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
public class Paciente {
    private int rutPaciente, numeroContacto;
    private String nombrePaciente, direccionPaciente;
    private Date fechaNacimiento;

    public Paciente() {
    }

    public Paciente(int rutPaciente, int numeroContacto, String nombrePaciente, String direccionPaciente, Date fechaNacimiento) {
        this.rutPaciente = rutPaciente;
        this.numeroContacto = numeroContacto;
        this.nombrePaciente = nombrePaciente;
        this.direccionPaciente = direccionPaciente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRutPaciente() {
        return rutPaciente;
    }

    public void setRutPaciente(int rutPaciente) {
        this.rutPaciente = rutPaciente;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rutPaciente=" + rutPaciente + ", numeroContacto=" + numeroContacto + ", nombrePaciente=" + nombrePaciente + ", direccionPaciente=" + direccionPaciente + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
