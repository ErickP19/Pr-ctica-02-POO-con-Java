/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.EntrenadorPersonal;
import java.util.HashSet;

/**
 *
 * @author erics
 */
public class ControladorEntrenadorPersonal1 {
   private HashSet<EntrenadorPersonal> lista;
   private int codigo;
       
    public ControladorEntrenadorPersonal1(){
        lista = new HashSet<>();
        codigo=0;
    }
    
    public void create(EntrenadorPersonal obj){
        codigo++;
        obj.setCodigo(codigo);
        lista.add(obj);
    }
    
    public EntrenadorPersonal read (int codigo){
        for (EntrenadorPersonal entre : lista) {
            if(entre.getCodigo()== codigo){
                return entre;
            }
        }
       return null;         
        }
    
    public EntrenadorPersonal update(EntrenadorPersonal obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        } 
       return null;        
    }
    
    public EntrenadorPersonal delete(EntrenadorPersonal obj){
        for (EntrenadorPersonal entre : lista) {            
            if(obj.getCodigo() == codigo){
                lista.remove(obj);
                break;
            }
            
        }
       return null;
        
    }
}
