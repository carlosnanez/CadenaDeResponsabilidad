/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaderesponsabilidades;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class CadenaDeResponsabilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        
        Hospital hospital = new Hospital();
      //  System.out.println("ingrese el nivel de atencion del triage del 1 al 5");
     
        hospital.solicitarAtencion(5);
        
    }
    
}
