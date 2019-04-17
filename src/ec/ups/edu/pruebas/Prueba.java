/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.pruebas;

import ec.ups.edu.clases.Entrenador;
import ec.ups.edu.clases.EntrenadorPersonal;
import ec.ups.edu.clases.EntrenadorPsicologico;
import ec.ups.edu.clases.Jugador;
import ec.ups.edu.clases.JugadorExtra;
import ec.ups.edu.clases.JugarProfesional;
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
    JugadorExtra ju1 = new JugadorExtra ("Gualaceo",123,false,22,166,280,"Medio Campo",2,"Erick Guzman","04412123",32112455,"Cuenca","ECuisda@gmail.com") ;
        System.out.println(ju1);
        System.out.println("\t" + ju1.Entrenando());
        System.out.println("\t" + ju1.Lesionado());
        System.out.println("\t" + ju1.descansar());
    
    List<Persona> lista = new ArrayList<>();
        lista.add(entre);
        lista.add(entre1);
        lista.add(ju);
        lista.add(ju1);
    
        
     System.out.println("\n------------------Downcasting con instanceof--------------");
       for (Persona persona : lista) {
            if (persona instanceof EntrenadorPersonal) {
                Entrenador e = (Entrenador) persona;
                System.out.println(e+"\n");
            } else if (persona instanceof EntrenadorPsicologico) {
                EntrenadorPsicologico e2 = (EntrenadorPsicologico) persona;
                System.out.println(e2+"\n");
            } else if (persona instanceof JugarProfesional) {
                JugarProfesional j1 = (JugarProfesional) persona;
                System.out.println(j1+"\n");
            } else if (persona instanceof JugadorExtra) {
                JugadorExtra cont = (JugadorExtra) persona;
                System.out.println(cont+"\n");
            }
        }
       
       System.out.println("///////////////////////////////////////////////////////////////////////////////////");
       System.out.println("----------Clases Anonimas----------");
         GregorianCalendar fechaContratacionTony = new GregorianCalendar(2019, 2, 31);

        Entrenador anonimo = new Entrenador(230,34,"Tiene experiencia",1,"Juan dominguez","010241231",849496262,"Avenidad sucre","eric@gmac.com") {
            
            public String responderMensajes() {
                return "----------  " +  super.getNombre() + " esta respondiendo mensajes";

            }
        };
        System.out.println(anonimo);
        System.out.println(anonimo.responderMensajes());

        Jugador anonimo2 = new Jugador(22,166,190,"Defensa",1,"Erick Parra","012499999",8411655,"Gualaceo","eerickas3") {
            
            public String verTelevision() {
                return "----------  " + super.getNombre() + " esta viendo television";
            }
        };
        System.out.println("\n");
        System.out.println(anonimo2);
        System.out.println(anonimo2.verTelevision());
    }
     
        
       
    }
    
    

