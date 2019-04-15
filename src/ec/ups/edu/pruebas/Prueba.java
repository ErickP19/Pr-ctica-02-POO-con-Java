/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.pruebas;

import ec.ups.edu.clases.Entrenador;
import ec.ups.edu.clases.EntrenadorPersonal;
import ec.ups.edu.clases.Persona;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author erics
 */
public class Prueba {
    public static void main (String args []){
      // List<Entrenador> lista = new ArrayList<>();
      //Creacion de fechas con el metodo GregorainCalendar.
        GregorianCalendar fechacontratacion = new GregorianCalendar(2001, 4, 22);
        GregorianCalendar e = new GregorianCalendar(1997, 7, 4);   
        GregorianCalendar e1 = new GregorianCalendar(1997, 7, 5);
        GregorianCalendar e2 = new GregorianCalendar(1997, 7, 11);
        GregorianCalendar e3 = new GregorianCalendar(1997, 5, 3);
        GregorianCalendar e4 = new GregorianCalendar(1997, 2, 2);
      // EntrenadorPersonal entre = new EntrenadorPersonal(1,"Jorge Parra","0123512312",568323434,"Gualaceo","Eruicasd123123");
        
        
    
    //Downcastin con el uso de instanceof.
    
        System.out.println("\n------------------Downcasting con instanceof--------------");

        for (Persona persona : lista) {
            if (persona instanceof EmpleadoAsalariado) {
                Entrenador a = (Entrenador) persona;
                System.out.println(a+"\n");
            } else if (persona instanceof EntradorPersonal) {
                EntradorPersonal tax = (EntradorPersonal) persona;
                System.out.println(tax+"\n");
            } else if (persona instanceof ProfesorSustituto) {
                JugadorProfesional p = (JugadorProfesional) persona;
                System.out.println(p+"\n");
            } else if (persona instanceof JugadorExtra) {
                JugadorExtra cont = (JugadorExtra) persona;
                System.out.println(cont+"\n");
            }
        }
    }
    
    
}
