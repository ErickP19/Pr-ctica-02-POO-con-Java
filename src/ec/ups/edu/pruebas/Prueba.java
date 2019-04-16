/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.pruebas;

import ec.ups.edu.clases.Entrenador;
import ec.ups.edu.clases.EntrenadorPersonal;
import ec.ups.edu.clases.EntrenadorPsicologico;
import ec.ups.edu.clases.JugarProfesional;
import ec.ups.edu.clases.Persona;
import java.util.GregorianCalendar;

/**
 *
 * @author erics
 */
public class Prueba {
    public static void main (String args []){
        
     GregorianCalendar fechacontratacion = new GregorianCalendar(2001, 8, 16);
     EntrenadorPersonal entre = new EntrenadorPersonal("ingeniero","habla ingles","calentamiento",254,12,"buen entrenador muy bn preparado",1,"Jorge Parra","0123512312",568323434,"Gualaceo","Eruicasd123123");
        System.out.println(entre);
        System.out.println("\t" + entre.comer());
        System.out.println("\t" + entre.descansar());
        System.out.println("\t" + entre.trabajar());     
     EntrenadorPsicologico entre1 = new EntrenadorPsicologico("Lcdo Nutrisionista y Lcdo Psicologo","Manejo de Ira",fechacontratacion.getTime(),250,25,"Exelente Psicologo para los jugadores ",2,"Jorge Matute","048154848",995666,"Gualaceo","Es@gmail.com");
        System.out.println(entre1);
        System.out.println("\t" + entre1.comer());
        System.out.println("\t" + entre1.descansar());
        System.out.println("\t" + entre1.verTelevision());
    JugarProfesional ju = new JugarProfesional ("Cuenca",185.2,true,25,173,300,"Delantero",1,"Jorge Parra","0123512312",568323434,"Gualaceo","Eruicasd123123");
        System.out.println(ju);
       System.out.println("\t" + ju.Entrenando());
       System.out.println("\t" + ju.Lesionaod());
       System.out.println("\t" + ju.descansar());
        
        
        
        
        
     
        
       
    }
    
    
}
