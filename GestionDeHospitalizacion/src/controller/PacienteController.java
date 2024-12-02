/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Paciente;
import java.sql.ResultSet;
/**
 *
 * @author Cetecom
 */
public class PacienteController {

    private List<Paciente> listaPacientes = new ArrayList<>();
    public PacienteController(List<Paciente> listaPacientes){
        this.listaPacientes = listaPacientes;
    }


    public PacienteController(Conexion cx) {
        this.cx = cx;
    }
     Conexion cx;
    public PacienteController(){
        cx = new Conexion ();
        cx.conectar();
        
       
    }
   //AGREGAR
    public void AgregarPaciente (int rutPaciente,int numeroContacto, String nombrePaciente, String direccionPaciente,Date fechaNacimiento){
        Paciente paciente = new Paciente(rutPaciente, numeroContacto, nombrePaciente, direccionPaciente, fechaNacimiento);
        listaPacientes.add(paciente);
        
        System.out.println("Paciente agregado correctamente"+ paciente);
        
    }
    //ELIMINAR
    public boolean EliminarPaciente (int rutPaciente,int numeroContacto, String nombrePaciente, String direccionPaciente,Date fechaNacimiento){
        for (Paciente paciente : listaPacientes){
            if (paciente.getNombrePaciente().equalsIgnoreCase(nombrePaciente)){
                listaPacientes.remove(paciente);
                System.out.println("Cliente Eliminado con exito.");
            }return true;
        }System.out.println("Cliente no Encontrado, intente nuevamente"); 
        return false;
    }
    
    //LISTAR
    public List <Paciente> listaPacientes (){
        List <Paciente> paciente = new ArrayList<>();
        String query = "SELECT * FROM PACIENTE";
        try{
            ResultSet rs = cx.EjecutarQuery(query);
            while (rs.next()){
                paciente.add(new Paciente(
                rs.getInt(1),
                rs.getInt(1),
                rs.getString(""),
                rs.getString(""),
                rs.getDate(query)
     
                ));
            }
 
        }catch (Exception e){
            System.out.println("Paciente no encontrado, vuelva a intentar.");
        }return paciente;
    }
   
    //MOSTRAR
    public void mostrarPacientes(){
        for (Paciente paciente : listaPacientes){
            System.out.println(paciente);
        }
    }
    
    
}
