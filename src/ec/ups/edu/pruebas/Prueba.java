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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author erics
 */
public class Prueba {
    public static void main (String args []){
        
        EntrenadorPersonal pepito =new EntrenadorPersonal();
        pepito.setCodigo(20);
        pepito.setNombre("Sony");
        
        EntrenadorPersonal pedro =new EntrenadorPersonal();
        pedro.setCodigo(20);
        pedro.setNombre("TCL");
        
        
        
        if(pepito.equals(pedro)){
            System.out.println("Son iguales :)");
            
        }else{
            System.out.println("No son iguales :(");
        }
        
        EntrenadorPsicologico s=new EntrenadorPsicologico();
        s.setCodigo(20);
        EntrenadorPsicologico l= new EntrenadorPsicologico();
        l.setCodigo(10);
        
        if(s.equals(l)){
            System.out.println("Son iguales :)");
        }
        else{
            System.out.println("No son iguales :(");
        }
        
        //Prueba de Set
        
        Set<EntrenadorPersonal> lista = new HashSet<>();
        lista.add(pepito);
        lista.add(pedro);
        for (EntrenadorPersonal entre : lista) {
            System.out.println("Entrenador Contratado " + entre.getNombre());
            
        }
        if(lista.contains(pedro)){
            System.out.println("En la lista si existe");
        }else        {
            System.out.println("No existe en la lista");
        }
        
      
        SortedSet<EntrenadorPersonal> listaOrdenada = new TreeSet<>();
        listaOrdenada.add(pepito);
        listaOrdenada.add(pedro);
         System.out.println("\t-----Lista Ordenada-----");
        for (EntrenadorPersonal entre : listaOrdenada) {
           
            System.out.println(entre.getNombre());
        }
        
        //Clase hasmap
        System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("HashMap");
        
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(15, "Ramos");
        map.put(3, "Pique");
        map.put(5, "Puyol");
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");
        map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");
        map.put(6, "Iniesta");
        map.put(7, "Villa");

// Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
            
           /*
           
            System.out.println("TreeMap");
            
        //Clase treemap
            Map<Integer, String> treeMap = new TreeMap<Integer, String>();
            treeMap.put(1, "Casillas");
            treeMap.put(15, "Ramos");
            treeMap.put(3, "Pique");
            treeMap.put(5, "Puyol");
            treeMap.put(11, "Capdevila");
            treeMap.put(14, "Xabi Alonso");
            treeMap.put(16, "Busquets");
            treeMap.put(8, "Xavi Hernandez");
            treeMap.put(18, "Pedrito");
            treeMap.put(6, "Iniesta");
            treeMap.put(7, "Villa");
            
            
// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
          Iterator t = treeMap.keySet().iterator();
            while (t.hasNext()) {
                Integer key1= (Integer) t.next();
                System.out.println("Clave: " + key1 + " -> Valor: " + treeMap.get(key1));
            
        
        
        /*
        
     GregorianCalendar fechacontratacion = new GregorianCalendar(2001, 8, 16);
     EntrenadorPersonal entre = new EntrenadorPersonal("ingeniero","habla ingles","calentamiento",254,12,"buen entrenador muy bn preparado",1,"Jorge Parra","0123512312",568323434,"Gualaceo","Eruicasd123123");
        System.out.println(entre);
        System.out.println("\t" + entre.comer());
        System.out.println("\t" + entre.descansar());
        System.out.println("\t" + entre.trabajar()); 
         EntrenadorPersonal entre2 = new EntrenadorPersonal("licenciado","habla ingles","calentamiento",254,12,"buen entrenador muy bn preparado",1,"Jorge Parra","0123512312",568323434,"Gualaceo","Eruicasd123123");
        if(entre.equals(entre2)){
            System.out.println("Son iguales");
            
        }else{
            System.out.println("No son iguales");
            
        }
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
    JugadorExtra ju2 = new JugadorExtra ("Gualaceo",123,false,22,166,280,"defensa ",3,"Roldan carlos","56265220",5548481,"Cuenca","juana@gmail.com") ;
        if(ju1.equals(ju2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        Set<JugadorExtra> lista = new HashSet<>();
            lista.add(ju1);
            lista.add(ju2);
          for(JugadorExtra jugador : lista){
              System.out.println("jugador:"+jugador.getNombre());
          }
          if(lista.contains(ju1)){
              System.out.println("Si existe!");
          }
              
               
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
     
        */
       
            }
        } 
    }

    

