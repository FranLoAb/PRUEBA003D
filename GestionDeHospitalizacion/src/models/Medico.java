/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Medico {
    
    private int rutMedico, numeroContactoMed;
    private String nombreMedico, especialidad;

    public Medico() {
    }

    public Medico(int rutMedico, int numeroContactoMed, String nombreMedico, String especialidad) {
        this.rutMedico = rutMedico;
        this.numeroContactoMed = numeroContactoMed;
        this.nombreMedico = nombreMedico;
        this.especialidad = especialidad;
    }

    public int getRutMedico() {
        return rutMedico;
    }

    public void setRutMedico(int rutMedico) {
        this.rutMedico = rutMedico;
    }

    public int getNumeroContactoMed() {
        return numeroContactoMed;
    }

    public void setNumeroContactoMed(int numeroContactoMed) {
        this.numeroContactoMed = numeroContactoMed;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico{" + "rutMedico=" + rutMedico + ", numeroContactoMed=" + numeroContactoMed + ", nombreMedico=" + nombreMedico + ", especialidad=" + especialidad + '}';
    }
    
    
    
}
