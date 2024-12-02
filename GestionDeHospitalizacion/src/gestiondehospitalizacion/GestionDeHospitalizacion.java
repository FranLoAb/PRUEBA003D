/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiondehospitalizacion;

import Bd.Conexion;
import controller.PacienteController;

import views.FormularioView;

/**
 *
 * @author Cetecom
 */
public class GestionDeHospitalizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion cx = new Conexion ();
        cx.conectar();
 
    }
 
  private void FormularioView (){
  FormularioView f = new FormularioView();
  f.setVisible(true);
  }
  
PacienteController pc = new PacienteController(); 






}
